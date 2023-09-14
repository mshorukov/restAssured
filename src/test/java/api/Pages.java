package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Pages {
    @JacksonXmlProperty(localName = "page")
    public Page page;
}
