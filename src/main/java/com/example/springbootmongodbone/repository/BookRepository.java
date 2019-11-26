package com.example.springbootmongodbone.repository;

import com.example.springbootmongodbone.document.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {
}
