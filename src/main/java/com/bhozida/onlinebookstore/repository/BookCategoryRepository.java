package com.bhozida.onlinebookstore.repository;

import com.bhozida.onlinebookstore.entity.BookCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource(collectionResourceRel = "bookCategory",path="book-category")
//@CrossOrigin("*")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long>{
    
}