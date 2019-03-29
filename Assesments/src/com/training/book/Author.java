package com.training.book;

public class Author {
	private String name;
	private int bookCount;
	public Author() {
	}
	public Author(String name, int bookCount) {
		this.name = name;
		this.bookCount = bookCount;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", bookCount=" + bookCount + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	
}
