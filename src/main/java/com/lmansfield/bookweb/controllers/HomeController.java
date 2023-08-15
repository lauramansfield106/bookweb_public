package com.lmansfield.bookweb.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.book.Book;


@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home page";
	}
	
	@RequestMapping("/book")
	public String book() {
		Book book = new Book("A Tree Grows in Brooklyn", "Betty Smith", 5, 0L);
		return book.toString();
	}
	
}
