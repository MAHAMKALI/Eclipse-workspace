package com.explore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explore.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
