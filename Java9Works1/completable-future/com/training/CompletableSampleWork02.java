package com.training;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 
 * @author Naveen
 * @see  Program to show working of thenApply, and accept.  
 * 		 we can have multiple thenApply method calls 
 *  	 where we can do multiple operations for the given data set then accept the changes 
 */

public class CompletableSampleWork02 {
	static List<String> pets = List.of("Dog", "Cat", "Horse", "Elephant", "Rat"); 

	public static void main(String[] args) {
		getPets()
		.thenApply(pet -> pet.subList(0, 3))
		.thenApply(pet -> pet.stream().sorted().collect(Collectors.toList()))
		.thenApply(pet -> pet.toString().toUpperCase())
		.thenAccept(System.out :: println); 
		
	}
	
	private static CompletableFuture<List<String>> getPets(){
		return CompletableFuture.supplyAsync(() -> pets); 
	}
}
