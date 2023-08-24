package com.lmansfield.bookweb.services;

import com.lmansfield.bookweb.model.Book;


import java.util.List;

import org.springframework.stereotype.Service;

public interface BookService {
	
	public String createBook(Book book);
	public String deleteBook(Long bookId);
	public Book getBook(Long bookId);
	public List<Book> getAllBooks();
	
}

