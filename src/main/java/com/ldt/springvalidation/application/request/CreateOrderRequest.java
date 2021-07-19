package com.ldt.springvalidation.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.ldt.springvalidation.domain.Product;

public class CreateOrderRequest {
    private Product product;


    public CreateOrderRequest() {
    }

    public CreateOrderRequest(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
