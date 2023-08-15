package com.lmansfield.bookweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.book.Book;

@RestController
@RequestMapping(path = "api/book")
public class BookController {
	@GetMapping
	public Book book() {
		Book book = new Book("A Tree Grows in Brooklyn", "Betty Smith", 5, 0L);
		return book;
	}
}
