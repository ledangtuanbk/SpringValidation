package com.ldt.springvalidation.infa.repository.cassandra;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.OrderStatus;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "tbl_order")
public class OrderCassandraEntity {
    @Id
    private UUID id;

    private OrderStatus orderStatus;
    private Long price;

    public OrderCassandraEntity(Order order){
        this.id = order.getId();
        this.orderStatus = order.getOrderStatus();
        this.price = order.getPrice();
    }


    public OrderCassandraEntity() {

    }

    public Order toOrder(){
        return null;
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
