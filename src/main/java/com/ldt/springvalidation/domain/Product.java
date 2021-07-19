package com.ldt.springvalidation.domain;

import java.util.UUID;

public class Product {
    private UUID id;
    private Long price;
    private String name;

    public Product(UUID id, Long price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
