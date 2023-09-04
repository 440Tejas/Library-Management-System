package com.libray.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libray.entity.Book;
import com.libray.repository.BookRepository;
import com.libray.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Book> addBooks(List<Book> books) {
		List<Book> savedbooks = bookRepository.saveAll(books);
		return savedbooks;
	}
	@Override
	public Book findById(int id) {
		Book book= bookRepository.findById(id).orElse(null);
		return book;
	}

}
