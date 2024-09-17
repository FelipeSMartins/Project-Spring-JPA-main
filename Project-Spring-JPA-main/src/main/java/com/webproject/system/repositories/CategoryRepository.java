package com.webproject.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
