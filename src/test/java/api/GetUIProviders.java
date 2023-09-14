package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class GetUIProviders {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "provider")
    public List<Provider> provider;

    @JacksonXmlProperty(localName = "result")
    public int result;
}
