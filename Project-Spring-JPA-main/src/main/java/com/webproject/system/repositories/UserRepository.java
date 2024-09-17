package com.webproject.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.system.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
