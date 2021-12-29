package com.graphql.springbootgrapqlexample.repository;

import com.graphql.springbootgrapqlexample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}