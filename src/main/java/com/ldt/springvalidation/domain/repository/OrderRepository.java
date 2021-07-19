package com.ldt.springvalidation.domain.repository;

import com.ldt.springvalidation.domain.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {

    Optional<Order> findById(UUID id);

    void save(Order order);
}
