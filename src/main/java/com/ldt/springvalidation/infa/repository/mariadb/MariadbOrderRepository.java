package com.ldt.springvalidation.infa.repository.mariadb;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
//@Primary
public class MariadbOrderRepository implements OrderRepository {
    private final SpringDataMariadbRepository springDataMariadbRepository;

    @Autowired
    public MariadbOrderRepository(SpringDataMariadbRepository springDataMariadbRepository) {
        this.springDataMariadbRepository = springDataMariadbRepository;
    }

    @Override
    public Optional<Order> findById(UUID id) {
        Optional<OrderEntity> byId = springDataMariadbRepository.findById(id);
        return byId.map(OrderEntity::toOrder);
    }

    @Override
    public void save(Order order) {
        OrderEntity orderEntity = new OrderEntity(order);
        springDataMariadbRepository.save(orderEntity);
    }

//    @Override
//    public Optional<Order> getOrder(UUID id) {
//        Optional<OrderEntity> byId = springDataMariadbRepository.findById(id);
//        return byId.map(OrderEntity::toOrder);
//    }
//
//    @Override
//    public void saveOrder(Order order) {
//        System.out.println("MariadbRepository.saveOrder");
//        OrderEntity orderEntity = new OrderEntity(order);
//        springDataMariadbRepository.save(orderEntity);
//    }
}
