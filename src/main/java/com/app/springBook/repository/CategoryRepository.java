package com.app.springBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springBook.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
