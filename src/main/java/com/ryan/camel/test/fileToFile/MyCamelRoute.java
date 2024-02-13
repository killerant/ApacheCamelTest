package com.ryan.camel.test.fileToFile;

import org.apache.camel.builder.RouteBuilder;
public class MyCamelRoute extends RouteBuilder {

    @Override public void configure() throws Exception
    {
        from("file:C:/Temp/Camel/Start?noop=true")
                .to("file:C:/Temp/Camel/End");
    }
}

