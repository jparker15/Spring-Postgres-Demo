package com.atsignJar.SpringPostgresDemo.controller;

import com.atsignJar.SpringPostgresDemo.entity.Book;
import com.atsignJar.SpringPostgresDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/update/{id}")
    public Book update(@Var){return bookService.updateBook();}

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable int id){
        return bookService.findByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){ bookService.deleteBook(id);}

}
