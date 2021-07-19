package com.ldt.springvalidation;

import com.ldt.springvalidation.domain.Order;
import com.ldt.springvalidation.domain.Product;
import com.ldt.springvalidation.domain.repository.OrderRepository;
import com.ldt.springvalidation.domain.service.DomainOrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DomainOrderServiceUnitTest {
    private OrderRepository orderRepository;
    private DomainOrderService tested;

    @BeforeEach
    void setUp() {
        orderRepository = mock(OrderRepository.class);
        tested = new DomainOrderService(orderRepository);
    }

    @Test
    void shouldCreateOrder_thenSaveIt() {
        final Product product = new Product(UUID.randomUUID(), 100L, "test");
        UUID id = tested.createOrder(product);
        verify(orderRepository).save(any(Order.class));
        assertNotNull(id);
    }
}
