package com.lmansfield.bookweb.services;

import com.lmansfield.bookweb.model.Book;


import java.util.List;

import org.springframework.stereotype.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.lmansfield.bookweb.model.Book;
//import com.lmansfield.bookweb.repositories.BookRepository;
//
//@Service
////service = service component class. tells us this class is a string bean, needs to be instantiated
////and paired with bean/autowired annotation
public interface BookService {
	public String createBook(Book book);
	public String updateBook(Book book);
	public String deleteBook(Long bookId);
	public Book getBook(Long bookId);
	/***
	 * Get all books in the database
	 * @return List of books
	 */
	public List<Book> getAllBooks();
	
}

//	
//	private final BookRepository bookRepo;
//	
//	public BookService() {
//		this.bookRepo = null;}
//	
//	@Autowired
//	public BookService(BookRepository bookRepo) {
//		this.bookRepo = bookRepo;
//	}
//	
//	
//	public List<Book> getBooks() {
//		return bookRepo.findAll();
//	
//	}
//
//	public void addNewBook(Book book) {
//		bookRepo.save(book);
//		
//	}
//}
