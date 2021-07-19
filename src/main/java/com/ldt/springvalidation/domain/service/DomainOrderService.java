package com.ldt.springvalidation.domain.service;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.Product;
import com.ldt.springvalidation.domain.repository.OrderRepository;

import java.util.UUID;

public class DomainOrderService implements OrderService {

    OrderRepository orderRepository;

    public DomainOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public UUID createOrder(Product product) {
        Order order = new Order(UUID.randomUUID(), product);
        orderRepository.save(order);
        return order.getId();
    }

    @Override
    public void complete(UUID id) {
        Order order = getOrder(id);
        orderRepository.save(order);
    }

    private Order getOrder(UUID id) {
//        orderRepository.getOrder(id);
        return null;
    }
}
