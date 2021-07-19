package com.ldt.springvalidation;

import com.ldt.springvalidation.application.cli.CliOrderController;
import com.ldt.springvalidation.application.response.CreateOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class SpringValidationApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringValidationApplication.class, args);
    }

    @Autowired
    public CliOrderController orderController;

    @Override
    public void run(String... args) throws Exception {
        CreateOrderResponse order = orderController.createOrder();
        System.out.println(order);
    }
}
