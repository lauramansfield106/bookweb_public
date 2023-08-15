package com.lmansfield.bookweb;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home page";
	}
	
}
