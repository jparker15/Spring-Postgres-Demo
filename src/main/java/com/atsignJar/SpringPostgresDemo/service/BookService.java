package com.atsignJar.SpringPostgresDemo.service;

import com.atsignJar.SpringPostgresDemo.entity.Book;
import com.atsignJar.SpringPostgresDemo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private Repository repository;

    public Book addBook (Book book){
        return repository.save(book);
    }

    public void deleteBook(@PathVariable int id){
        System.out.println("Successfully deleted" + repository.findById(id));
        repository.deleteById(id);
    }

    public void updateBook(String title,String author,int id){
        Book book = repository.findById(id).orElse(null);
        book.setTitle(title);
        book.setAuthor(author);
        System.out.println(repository.findById(id) + "Successful update");
    }

    public List<Book> findAll(){
       return repository.findAll();
    }

    public Optional<Book> findByID(@PathVariable int id){return repository.findById(id); }


}
