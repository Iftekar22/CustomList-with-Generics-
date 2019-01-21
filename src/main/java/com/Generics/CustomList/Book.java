package com.Generics.CustomList;

public class Book {
	String authorName;
	String name;
	String publishDate;
	double isbn;
	double prize;
	
	public Book(String authorName, String name, String publishDate, double isbn, double prize) {
		
		this.authorName = authorName;
		this.name = name;
		this.publishDate = publishDate;
		this.isbn = isbn;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", name=" + name + ", publishDate=" + publishDate + ", isbn=" + isbn
				+ ", prize=" + prize + "]";
	}
	

}
