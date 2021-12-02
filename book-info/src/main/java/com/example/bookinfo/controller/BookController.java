package com.example.bookinfo.controller;

import com.example.bookinfo.model.Book;
import com.example.bookinfo.repo.BookRepo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    final RestTemplate restTemplate = new RestTemplate();
    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/health/ready")
    @ResponseStatus(HttpStatus.OK)
    public void ready(){}

    @GetMapping("/health/live")
    @ResponseStatus(HttpStatus.OK)
    public void live(){}

    @GetMapping
    public List<Book> getOrder(){
        return bookRepo.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookRepo.save(book);
    }



}
