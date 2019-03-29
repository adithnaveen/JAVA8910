package com.trainings.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOOperationDemo {
	public static void main(String[] args) throws IOException {

		listWork();

		findWork();

		walkWork();
	}

	/**
	 * @throws IOException
	 */
	private static void listWork() throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);

		System.out.println(Files.list(Paths.get(".")).count());

		Path path = Paths.get("Hello.txt");
		// convert the object to a stream of String type.
		Stream<String> str = Files.lines(path);
		// print the String stream
		str.forEach(System.out::println);
	}

	/**
	 * @throws IOException
	 */
	private static void findWork() throws IOException {
		final int maxDepth = 6;

		Path path1 = Paths.get("C:\\Companies");

		Stream<Path> matches = Files.find(path1, maxDepth,
				(p, basicFileAttributes) -> String.valueOf(p).endsWith(".txt"));

		System.out.println(matches.sorted().map(String::valueOf).collect(Collectors.joining(";")));
//	    matches.forEach(System.out :: println);

//	    matches.map(x -> x.getFileName())
//	    	.forEach(System.out :: println);
	}

	/**
	 * @throws IOException
	 */
	private static void walkWork() throws IOException {
		Path path1 = Paths.get("C:\\Companies");
		final int MAX_LEVEL = 2; 
		Stream<Path> stream = Files.walk(path1, MAX_LEVEL);

//        stream.limit(10).forEach(System.out :: println);

		stream.filter(Files::isRegularFile).filter(Files::isWritable)
		// if you want to check in between you can use peek method 
//        	.peek(x -> System.out.println("-- " + x))
				.filter(x -> x.getFileName().toString().endsWith("png")).limit(10).forEach(System.out::println);
	}
}
