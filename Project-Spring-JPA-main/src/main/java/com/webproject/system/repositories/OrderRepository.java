package com.webproject.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
