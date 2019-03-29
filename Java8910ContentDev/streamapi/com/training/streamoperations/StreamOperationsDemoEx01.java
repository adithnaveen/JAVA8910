package com.training.streamoperations;

import java.util.stream.Stream;

/**
 * 
 * @author Naveen
 * @see Program to show working of simple stream operations and introduce to 
 * Source, Intermediate and terminal operations, the list of String.  
 * Streams are lazy if, each element shall be shown on the console only when 
 * forEach iterator is used, if you take off the forEach statement then no 
 * output is generated 
 */
public class StreamOperationsDemoEx01 {
	 public static void main(String args[]) {
		 
		 Stream.of("hello", "how", "are", "you", "doing", "today")
		 	.peek(val -> System.out.println("Peeked At :" + val))
		 		.limit(5)
		 		.distinct()
		 		.forEach(System.out :: println);
		  }
}
