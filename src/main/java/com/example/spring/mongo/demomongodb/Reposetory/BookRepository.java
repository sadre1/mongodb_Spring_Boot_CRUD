package com.example.spring.mongo.demomongodb.Reposetory;

import com.example.spring.mongo.demomongodb.Dto.Books;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface BookRepository extends MongoRepository<Books,Integer> {
   public  List<Books> findByName(String name);
}
