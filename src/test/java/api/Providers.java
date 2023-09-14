package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Providers {
    @JacksonXmlProperty(localName = "getUIProviders")
    public GetUIProviders getUIProviders;
}
