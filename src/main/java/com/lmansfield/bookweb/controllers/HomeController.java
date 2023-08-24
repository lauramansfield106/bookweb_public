package com.lmansfield.bookweb.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmansfield.bookweb.model.Book;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}
	

	
}
