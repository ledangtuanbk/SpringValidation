package com.ldt.springvalidation.infa.repository.cassandra;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.repository.OrderRepository;
import com.ldt.springvalidation.infa.repository.mariadb.OrderEntity;
import com.ldt.springvalidation.infa.repository.mariadb.SpringDataMariadbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@Primary
public class CassandradbOrderRepository implements OrderRepository {
    private final SpringDataCassandraDbOrderRepository repository;

    @Autowired
    public CassandradbOrderRepository(SpringDataCassandraDbOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Order> getOrder(UUID id) {
//        Optional<OrderEntity> byId = repository.findById(id);
//        return byId.map(OrderEntity::toOrder);
        return null;
    }

    @Override
    public void saveOrder(Order order) {
        System.out.println("MariadbRepository.saveOrder");
        OrderCassandraEntity orderEntity = new OrderCassandraEntity(order);
        repository.save(orderEntity);
    }
}
