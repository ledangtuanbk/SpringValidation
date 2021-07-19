package com.ldt.springvalidation.infa.repository.mariadb;

import com.ldt.springvalidation.SpringValidationApplication;
import com.ldt.springvalidation.domain.repository.OrderRepository;
import com.ldt.springvalidation.domain.service.DomainOrderService;
import com.ldt.springvalidation.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringValidationApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
