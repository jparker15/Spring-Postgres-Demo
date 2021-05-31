package com.atsignJar.SpringPostgresDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Library")

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
        this.author = title;
    }

}
