package com.ryan.camel.test.soap.file;

public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String productId;
    public ProductNotFoundException(String id) {
        this.productId = id;
    }

    public String toString() {
        return "Product " + productId + " not found exception";
    }
}
