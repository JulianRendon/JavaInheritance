package com.julianrendon.javainheritance;

public class Book extends Product {

	private String author;
	
	public Book() {
        super(); // call constructor of Product superclass
        author = "";
        count++; // update the count variable in the Product superclass
    }

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}	
	
}
