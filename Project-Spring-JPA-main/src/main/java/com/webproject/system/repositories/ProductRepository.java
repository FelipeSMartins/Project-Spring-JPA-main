package com.webproject.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
