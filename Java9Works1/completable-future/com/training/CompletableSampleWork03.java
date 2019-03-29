package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Naveen
 * @see Program show the use of combine 
 * 
 */
public class CompletableSampleWork03 {

	private static CompletableFuture<String> getData() {
		return CompletableFuture.supplyAsync(() -> "India");
	}

	private static CompletableFuture<String> getData1() {
		return CompletableFuture.supplyAsync(() -> "Bengaluru");
	}

	private static CompletableFuture<String> getData(String data) {
		System.out.println("Processing " + data);
		return CompletableFuture.supplyAsync(() -> data.toUpperCase());
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// combining data using piping
		getData().thenCombine(getData1(), (s1, s2) -> s1 + s2).thenAccept(System.out::println);

		System.out.println("------------------------------------------------------------");

		System.out.println("String got from joining : " +

			Stream.of(getData("New York"), getData("Cupertino"), getData("Virginia")).
			map(CompletableFuture::join)
					.collect(Collectors.joining(" ")));

	}

}
