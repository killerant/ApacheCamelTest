package com.ryan.camel.test.soap.file.product_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.6.2
 * 2024-02-13T21:00:39.561+08:00
 * Generated source version: 3.6.2
 *
 */
@WebService(targetNamespace = "http://file.soap.test.camel.ryan.com/product-service", name = "Product")
@XmlSeeAlso({com.ryan.camel.test.soap.file.product_service.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Product {

    @WebMethod
    @WebResult(name = "productResponse", targetNamespace = "http://file.soap.test.camel.ryan.com/product-service/types", partName = "response")
    public com.ryan.camel.test.soap.file.product_service.types.ProductResponse getProductDetails(

        @WebParam(partName = "request", name = "productRequest", targetNamespace = "http://file.soap.test.camel.ryan.com/product-service/types")
        com.ryan.camel.test.soap.file.product_service.types.ProductRequest request
    ) throws ErrorMessage;
}
