package com.lmansfield.bookweb.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.model.Book;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home page";
	}
	

	
}
