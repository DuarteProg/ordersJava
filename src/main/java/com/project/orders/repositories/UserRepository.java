package com.project.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.orders.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
