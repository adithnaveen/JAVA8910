package com.training.book;

public class Book {
	private String title;
	private int year;
	private Author author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", year=" + year + ", author=" + author + "]";
	}
	public Book(String title, int year, Author author) {
		this.title = title;
		this.year = year;
		this.author = author;
	}
	public Book() {
		
	}
}
