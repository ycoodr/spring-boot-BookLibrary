package com.app.springBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springBook.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{
    
}
