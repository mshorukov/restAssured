package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import javax.xml.stream.XMLStreamReader;

import static io.restassured.RestAssured.given;

public class CheckProvidersTest {

    private final static String BASE_URI = "https://test.pay24.asia/";
    private final static String BASE_PATH = "api2/xml/getUIProviders/";

    RequestSpecification httpRequest;
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
        Header acceptHeader = new Header("Accept", "application/xml");
        httpRequest = RestAssured.given().header(acceptHeader);
    }
    @Test(description = "Проверка количества провайдеров")
    public void checkProvidersCount() {
        RestAssured.useRelaxedHTTPSValidation(); // Если используется HTTPS и требуется валидация сертификата

        // Создаем XML-строку для запроса
        String xmlRequest = "<?xml version=\"1.0\" encoding=\"windows-1251\"?>\n" +
                "<request>\n" +
                "    <auth login=\"b_moldobaev\" sign=\"cc08131a49228a25001ba82f02182cc5ddd2e999d3cee806543cf851239c7e50\" signAlg=\"MD5\"/>\n" +
                "    <providers>\n" +
                "        <getUIProviders/>\n" +
                "    </providers>\n" +
                "</request>";

        // Отправляем POST-запрос с XML-телом
        Response response = given()
                .contentType(ContentType.XML)
                .body(xmlRequest)
                .when()
                .post();

        // Обрабатываем ответ
        int statusCode = response.getStatusCode();
        String responseBody = String.valueOf(response.getBody().asString());

        System.out.println("Статус код: " + statusCode);
        if (statusCode == 200) {
            XmlMapper xmlMapper = new XmlMapper();
            try {
                // Десериализуем XML в объект Provider
                Provider apiResponse = xmlMapper.readValue(responseBody, Provider.class);
                System.out.println("Количество провайдеров: " + apiResponse.providers.getUIProviders.provider.size());
                // Теперь у вас есть экземпляр Provider с данными из XML
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Ошибка: " + responseBody);
        }

    }
}
