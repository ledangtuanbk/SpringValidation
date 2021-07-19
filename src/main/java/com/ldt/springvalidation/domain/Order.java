package com.ldt.springvalidation.domain;

import java.util.UUID;

public class Order {
    private UUID id;
    private OrderStatus orderStatus;
    private Long price;

    public Order(UUID id, Product product) {
        this.id = id;
        this.orderStatus = OrderStatus.CREATED;
        this.price = product.getPrice();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
