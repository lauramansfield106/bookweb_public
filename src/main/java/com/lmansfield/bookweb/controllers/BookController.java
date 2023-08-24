package com.lmansfield.bookweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.lmansfield.bookweb.services.BookService;
import com.lmansfield.bookweb.model.Book;
import com.lmansfield.bookweb.repositories.BookRepository;
import com.lmansfield.bookweb.services.BookService;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/")
public class BookController {
	

	private BookService bookService;
	
	//you could use the autowired annotation to avoid building this constructor
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	
	
	@GetMapping("/")
	public String viewBooks(Model model) {
		model.addAttribute("listBooks", bookService.getAllBooks());
		return "books";
	}
	
	
	@GetMapping("/showNewBookForm")
	public String showNewBookForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "new_book";
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.createBook(book);
		return "redirect:/";
	}
	
	
	
	@GetMapping("/showEditBookForm/{id}")
	public String showEditBookForm(@PathVariable(value = "id") Long id, Model model) {
		Book book = bookService.getBook(id);
		
		model.addAttribute("book", book);
		return "update_book";
	}
	
	
	//remove a book selected by user
	//in the jsp file, we pass the  href as "/remove-book?id=${book.id}" to get the parameter
	@GetMapping("/deleteBook/{id}")
	public String removeBook(@PathVariable(value = "id") Long id) {
		
		bookService.deleteBook(id);
		
		
		return "redirect:/"; 
	}
	
	



	
}
