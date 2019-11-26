package com.example.springbootmongodbone.repository;

import com.example.springbootmongodbone.document.Library;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends MongoRepository<Library, Long> {

}
