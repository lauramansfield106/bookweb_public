package com.lmansfield.bookweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.services.BookService;
import com.lmansfield.bookweb.model.Book;
import com.lmansfield.bookweb.repositories.BookRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
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
	
	@PostMapping
	public void addBook(@RequestBody Book book) {
		bookService.addNewBook(book);
	}

	
}
