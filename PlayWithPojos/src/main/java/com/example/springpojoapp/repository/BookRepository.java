package com.example.springpojoapp.repository;


import com.example.springpojoapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
