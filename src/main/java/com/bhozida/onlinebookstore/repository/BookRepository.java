package com.bhozida.onlinebookstore.repository;

import com.bhozida.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long>{
    
}