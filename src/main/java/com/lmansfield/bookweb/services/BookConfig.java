package com.lmansfield.bookweb.services;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lmansfield.bookweb.book.Book;

@Configuration
public class BookConfig {


	@Bean
	CommandLineRunner commandLineRunner(BookRepository repo) {
		return args -> {		
			Book mybook = new Book("A Tree Grows in Brooklyn", "Betty Smith", 5, 0L);
			repo.save(mybook);

		};
	}
}


