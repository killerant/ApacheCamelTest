package com.ryan.camel.test.fileToFile;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MyApp {
    public static void main(String[] args) throws Exception
    {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new MyCamelRoute());

        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}

