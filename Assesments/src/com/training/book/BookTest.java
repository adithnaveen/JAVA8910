package com.training.book;

import java.util.List;
import java.util.Objects;

public class BookTest {

	public static void main(String[] args) {
		List<Book> bookList = BookLibrary.getBookList();
		// print Author names of books published after 2005
		for (Book book : bookList) {
			if(book.getAuthor()!=null && book.getYear()>2005) {
				System.out.println(book.getAuthor().getName());
			}
		}
		System.out.println();
		bookList.stream().filter(book->book.getYear()>2005)
		     .map(Book::getAuthor).filter(Objects::nonNull)
		     .map(Author::getName)
		     .forEach(System.out::println);
		     

	}

}
