package com.ldt.springvalidation.infa.repository.mariadb;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.OrderStatus;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tbl_order")
public class OrderEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private OrderStatus orderStatus;
    private Long price;

    public OrderEntity(Order order){
        this.id = order.getId();
        this.orderStatus = order.getOrderStatus();
        this.price = order.getPrice();
    }


    public OrderEntity() {

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
