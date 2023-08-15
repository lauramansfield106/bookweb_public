package com.lmansfield.bookweb.book;

import java.util.Objects;





public class Book {

	private Long id;
	
	//other instance vars
	private String title;
	private String author;
	private int rating;
	
	
	//Getters and Setters
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//Constructors
	public Book() {}
	
	public Book(String title, String author, int rating, Long id) {
		this.title = title;
		this.author = author;
		this.rating = rating;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return String.format("Book [title=%s, author=%s, rating=%s]", title, author, rating);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id) ;
	}
}
