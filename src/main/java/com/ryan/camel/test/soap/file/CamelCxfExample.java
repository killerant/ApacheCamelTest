package com.ryan.camel.test.soap.file;

import com.ryan.camel.test.soap.file.product_service.types.ProductRequest;
import com.ryan.camel.test.soap.file.product_service.types.ProductResponse;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelCxfExample {
    private static ProducerTemplate template;

    public static void main(String[] args) throws Exception {
        System.setProperty("port1", "9086");
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CamelContext camelContext = SpringCamelContext.springCamelContext(
                appContext, false);
        try {
            template = camelContext.createProducerTemplate();
            System.out.println("Start camel context");
            camelContext.start();
            printProductDetails("P01");
            printProductDetails("P02");
            //printProductDetails("Uknown");
        } finally {
            Thread.sleep(300000);
            camelContext.stop();
            System.out.println("Stop camel context");
        }
    }
    private static void printProductDetails(String id) {
        try {
            System.out.println("Request: Get " + id + " details ");
            ProductRequest request = new ProductRequest();
            request.setId(id);
            ProductResponse response = template.requestBody("direct:start",
                    request, ProductResponse.class);
            System.out.println("Response: Id: " + response.getId() + ", Product: "
                    + response.getDescription() + ", Price: " + response.getPrice());
        } catch (CamelExecutionException p) {
            System.out.println(p.getCause());
        }
    }
}
