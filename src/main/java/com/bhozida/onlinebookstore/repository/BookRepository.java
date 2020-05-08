package com.bhozida.onlinebookstore.repository;

import com.bhozida.onlinebookstore.entity.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
//import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,Long>{

    @RestResource(path="categoryid")
    Page<Book> findByCategoryId(@Param("id") Long id,Pageable pageable);
    

    //http://localhost:8080/api/v1/books/search/searchbykeyword?name=python
    @RestResource(path="searchbykeyword")
    Page<Book> findByNameContaining(@Param("name") String keyword,Pageable pageable);
    
}