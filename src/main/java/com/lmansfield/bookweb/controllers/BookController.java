package com.lmansfield.bookweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.book.Book;
import com.lmansfield.bookweb.services.BookService;

import java.util.List;

@RestController
@RequestMapping(path = "api/book")
public class BookController {
	
	private final BookService bookService;
	

	//autowired = We want to inject the private instance of bookService into this controller
	//this is a bean
	@Autowired 
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Book> getBooks() {
		return bookService.getBooks();
	
	}
}
