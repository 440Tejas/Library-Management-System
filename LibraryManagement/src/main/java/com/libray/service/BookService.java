package com.libray.service;

import java.util.List;

import com.libray.entity.Book;

public interface BookService {
  
	List<Book> addBooks(List<Book> books);
	
	Book findById(int id);
}
