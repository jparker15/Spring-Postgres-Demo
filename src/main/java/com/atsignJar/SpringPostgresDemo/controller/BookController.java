package com.atsignJar.SpringPostgresDemo.controller;

import com.atsignJar.SpringPostgresDemo.entity.Book;
import com.atsignJar.SpringPostgresDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/test")
    public String test(){
        return "Working./..";
    }
    @GetMapping("/all")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @PostMapping("/addBook")
    public Book post(@RequestBody Book book){
       return bookService.addBook(book);
    }

}
