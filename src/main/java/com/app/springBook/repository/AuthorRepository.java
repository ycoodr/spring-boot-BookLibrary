package com.app.springBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.springBook.entity.Author;;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
