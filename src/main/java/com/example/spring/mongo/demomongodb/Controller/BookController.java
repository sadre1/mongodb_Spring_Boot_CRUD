package com.example.spring.mongo.demomongodb.Controller;

import com.example.spring.mongo.demomongodb.Dto.Books;
import com.example.spring.mongo.demomongodb.Dto.CreateRequest;
import com.example.spring.mongo.demomongodb.Reposetory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;
    @GetMapping("/mongodata")
    public List<Books> getData(){
        return bookRepository.findAll();
    }
    @PostMapping("/create")
    public void insertBooks(@RequestBody CreateRequest request){
        Books book = new Books(request.getName(),request.getAuthorName(),request.getCost());
        bookRepository.save(book);
    }
    @GetMapping("/searchId")
    public List<Books> serachByname(@RequestParam(value = "name") String name){
        return bookRepository.findByName(name);
    }
}
