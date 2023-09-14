package src.test.java.api;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Controls {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "control")
    public List<Control> control;
}
