package com.ldt.springvalidation.infa.repository.mariadb;

import com.ldt.springvalidation.domain.repository.OrderRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMariadbRepository extends CrudRepository<OrderEntity, UUID> {

}
