package com;

public class Book {
	public String title;
	public String author;
	public int pageNumber;
	public int totalPages;
	public boolean isBeingRead;
	
	// Constructor
	public Book(String title, String author, boolean isBeingRead) {
		this.title = title;
		this.author = author;
		this.isBeingRead = isBeingRead;
		
	}
	
	public static Book book1 = new Book("Oh, the Places You'll Go!", " Dr. Suess", false);
	
}
