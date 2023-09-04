package com.libray.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libray.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
