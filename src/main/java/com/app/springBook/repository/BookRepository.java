package com.app.springBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springBook.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
