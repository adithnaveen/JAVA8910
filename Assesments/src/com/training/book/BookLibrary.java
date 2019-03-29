package com.training.book;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
	private static List<Book> bookList;

	static {
		bookList = new ArrayList<>();
		bookList.add(new Book("Java", 2017, new Author("Joshua", 5)));
		bookList.add(new Book("C++", 2006, new Author("Scott", 3)));
		bookList.add(new Book("DotNet", 2012, new Author("Steven", 7)));
		bookList.add(new Book("SQL", 2003, new Author("Lynn", 10)));
	}
	public static List<Book> getBookList() {
		return bookList;
	}
	
}
