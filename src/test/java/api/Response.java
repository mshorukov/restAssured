package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Response {
    @JacksonXmlProperty(localName = "providers")
    public Providers providers;

    @JacksonXmlProperty(localName = "result")
    public int result;
}
