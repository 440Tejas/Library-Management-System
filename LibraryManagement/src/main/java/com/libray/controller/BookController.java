package com.libray.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libray.entity.Book;
import com.libray.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@PostMapping("addBook")
	public List<Book> addBooks(@RequestBody List<Book> books ) {
		System.out.println("boks");
		List<Book> savedbooks = bookService.addBooks(books);
		return savedbooks;
	}
	
	@GetMapping("getBookById/{id}")
	public Book getBookById(@PathVariable int id ) {
		
		return bookService.findById(id);
		
		
	}
	
	
  
}
