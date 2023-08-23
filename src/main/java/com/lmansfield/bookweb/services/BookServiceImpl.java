package com.lmansfield.bookweb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lmansfield.bookweb.model.Book;
import com.lmansfield.bookweb.repositories.BookRepository;

@Service
//service = service component class. 
public class BookServiceImpl implements BookService {
	

	BookRepository bookRepo;
	
	public BookServiceImpl(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	
	
	@Override
	public String createBook(Book book) {
		bookRepo.save(book);
		return "Book saved.";
	}

	@Override
	public String updateBook(Book book) {
		bookRepo.save(book);
		
		return "Book updated.";
	}

	@Override
	public String deleteBook(Long bookId) {
		bookRepo.deleteById(bookId);
		return "Book deleted.";
	}

	@Override
	public Book getBook(Long bookId) {
		return bookRepo.findById(bookId).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

}
