package com.lmansfield.bookweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmansfield.bookweb.book.Book;

@Service
//service = service component class. tells us this class is a string bean, needs to be instantiated
//and paired with bean/autowired annotation
public class BookService {
	
	private final BookRepository bookRepo;
	
	public BookService() {
		this.bookRepo = null;}
	
	@Autowired
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	
	public List<Book> getBooks() {
		return bookRepo.findAll();
	
	}
}
