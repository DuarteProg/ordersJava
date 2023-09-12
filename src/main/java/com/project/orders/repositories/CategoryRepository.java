package com.project.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.orders.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
