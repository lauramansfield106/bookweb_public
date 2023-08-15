package com.lmansfield.bookweb.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lmansfield.bookweb.book.Book;

@Service
//service = service component class. tells us this class is a string bean, needs to be instantiated
//and paired with bean/autowired annotation
public class BookService {
	
	
	public List<Book> getBooks() {
		return List.of(new Book(
				"A Tree Grows in Brooklyn", "Betty Smith", 5, 0L
				)
		);
	
	}
}
