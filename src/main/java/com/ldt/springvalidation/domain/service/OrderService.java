package com.ldt.springvalidation.domain.service;

import com.ldt.springvalidation.domain.Product;

import java.util.UUID;

public interface OrderService {
    UUID createOrder(Product product);

    void complete(UUID id);
}
