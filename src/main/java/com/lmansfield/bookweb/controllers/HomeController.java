package com.lmansfield.bookweb.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.model.Book;


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
	

	
}
