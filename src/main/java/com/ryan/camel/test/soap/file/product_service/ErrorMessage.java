
package com.ryan.camel.test.soap.file.product_service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.6.2
 * 2024-02-13T21:00:39.503+08:00
 * Generated source version: 3.6.2
 */

@WebFault(name = "error", targetNamespace = "http://file.soap.test.camel.ryan.com/product-service/types")
public class ErrorMessage extends Exception {

    private com.ryan.camel.test.soap.file.product_service.types.Error faultInfo;

    public ErrorMessage() {
        super();
    }

    public ErrorMessage(String message) {
        super(message);
    }

    public ErrorMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ErrorMessage(String message, com.ryan.camel.test.soap.file.product_service.types.Error error) {
        super(message);
        this.faultInfo = error;
    }

    public ErrorMessage(String message, com.ryan.camel.test.soap.file.product_service.types.Error error, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = error;
    }

    public com.ryan.camel.test.soap.file.product_service.types.Error getFaultInfo() {
        return this.faultInfo;
    }
}