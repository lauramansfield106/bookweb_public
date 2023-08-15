package com.lmansfield.bookweb.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmansfield.bookweb.book.Book;

@Repository //repo component. can be autowired
public interface BookRepository extends JpaRepository<Book, Long>{
}
