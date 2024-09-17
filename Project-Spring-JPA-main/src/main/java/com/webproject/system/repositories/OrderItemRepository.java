package com.webproject.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.system.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
