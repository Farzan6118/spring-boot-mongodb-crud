package com.example.springbootmongodbone.repository;

import com.example.springbootmongodbone.document.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, Long> {
}
