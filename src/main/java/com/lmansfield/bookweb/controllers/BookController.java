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
import org.springframework.web.bind.annotation.RestController;

//import com.lmansfield.bookweb.services.BookService;
import com.lmansfield.bookweb.model.Book;
import com.lmansfield.bookweb.repositories.BookRepository;
import com.lmansfield.bookweb.services.BookService;

import java.util.List;

@Controller
//@RequestMapping("/")
public class BookController {
	

	private BookService bookService;
	
	//you could use the autowire annotation to avoid building this constructor
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
	
	
	
	
//	@GetMapping("{bookId}")
//	public Book getBook(@PathVariable("bookId") Long bookId) {
//		return bookService.getBook(bookId);		
//	}
//	
//	@GetMapping()
//	public List<Book> getAllBooks() {
//		return bookService.getAllBooks();		
//	}
//		
//	//Here, we add the RequestBody annotation to indicate we will get the details from a post mapping
//	@PostMapping
//	public String createBookDetails(@RequestBody Book book) {
//		bookService.createBook(book);
//		return "Book created.";
//		
//	}
//	
//	@PutMapping
//	public String updateBookDetails(@RequestBody Book book) {
//		bookService.createBook(book);
//		return "Book updated.";
//		
//	}
//	
//	@DeleteMapping("{bookId}")
//	public String deleteBookDetails(@PathVariable("bookId") Long bookId) {
//		bookService.deleteBook(bookId);
//		return "Book deleted.";
//		
//	}


	
}
