package com.lmansfield.bookweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.lmansfield.bookweb.services.BookService;
import com.lmansfield.bookweb.model.Book;
import com.lmansfield.bookweb.repositories.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
	
//	private final BookService bookService;
	
	Book book;
//	
//	//autowired = We want to inject the private instance of bookService into this controller
//	//this is a bean
//	@Autowired 
//	public BookController(BookService bookService) {
//		this.bookService = bookService;
//	}
	
	/***
	 * Get book by id
	 * @param id
	 * @return
	 */
	@GetMapping("{bookId}")
	public Book getBook(Long id) {
		
		return book;
		//return new  Book("The Cat in the Hat", "Doctor Seuss", 5, 3L);
	}
		
	//Here, we add the RequestBody annotation to indicate we will get the details from a post mapping
	@PostMapping
	public String createBookDetails(@RequestBody Book book) {
		this.book = book;
		return "Book created.";
		
	}
	
	@PutMapping
	public String updateBookDetails(@RequestBody Book book) {
		this.book = book;
		return "Book updated.";
		
	}
	
	@DeleteMapping("{bookId}")
	public String deleteBookDetails(String bookID) {
		this.book = null;
		return "Book deleted.";
		
	}
//	@GetMapping
//	public List<Book> getBooks() {
//		return bookService.getBooks();
//	
//	}
//	
//	@PostMapping
//	public void addBook(@RequestBody Book book) {
//		bookService.addNewBook(book);
//	}

	
}
