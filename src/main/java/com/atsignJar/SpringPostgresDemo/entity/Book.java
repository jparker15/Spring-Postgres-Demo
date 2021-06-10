package com.atsignJar.SpringPostgresDemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "library")

public class Book {
    private String title;
    private String author;
    @Id
    @GeneratedValue
    private int id;

    public Book(){

    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;


    }

    public long getId(){
        return id;
    }

    public void setId(int id) {this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
