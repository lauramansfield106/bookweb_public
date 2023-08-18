package com.lmansfield.bookweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmansfield.bookweb.model.Book;

@Repository //repo component. can be autowired
public interface BookRepository extends JpaRepository<Book, Long>{
}
