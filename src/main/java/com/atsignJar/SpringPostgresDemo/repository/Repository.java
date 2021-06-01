package com.atsignJar.SpringPostgresDemo.repository;

import com.atsignJar.SpringPostgresDemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Book,Integer> {


}
