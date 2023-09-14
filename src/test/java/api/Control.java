package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Control {
    @JacksonXmlProperty(localName = "header")
    public String header;

    @JacksonXmlProperty(localName = "mask")
    public Object mask;

    @JacksonXmlProperty(localName = "regexp")
    public String regexp;

    @JacksonXmlProperty(localName = "name")
    public String name;

    @JacksonXmlProperty(localName = "nobr")
    public boolean nobr;

    @JacksonXmlProperty(localName = "orderId")
    public int orderId;

    @JacksonXmlProperty(localName = "strip")
    public boolean strip;

    @JacksonXmlProperty(localName = "type")
    public String type;

    @JacksonXmlProperty(localName = "layout")
    public String layout;
}
