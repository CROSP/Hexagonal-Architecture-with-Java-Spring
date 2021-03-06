package com.baeldung.hexagonal.store.persistence.repo.order;

import com.baeldung.hexagonal.store.core.context.order.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}