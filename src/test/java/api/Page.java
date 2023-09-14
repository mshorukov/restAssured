package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Page {
    @JacksonXmlProperty(localName = "controls")
    public Controls controls;

    @JacksonXmlProperty(localName = "orderId")
    public int orderId;

    @JacksonXmlProperty(localName = "pageId")
    public int pageId;
}
