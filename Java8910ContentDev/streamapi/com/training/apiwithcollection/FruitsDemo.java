package com.training.apiwithcollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author Naveen
 * @see  -> In slides 
 * 		// Try this 
		//fruits.stream().min(Comparator.comparing(fruit -> ((String) fruit).length()).reversed()).get();
		
	//Solution for Count 
	//long count = fruits.stream().filter( fruit -> fruit.startsWith(“A”)).count();
 */


public class FruitsDemo {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		Stream<String> stream = fruits.stream();
		stream.filter(fruit -> fruit.startsWith("A")).forEach(System.out::println);

		System.out.println("-----------------------------------");
		fruits.stream().map(fruit -> fruit.toUpperCase()).forEach(System.out::println);

		String minimum = fruits.stream().min(Comparator.comparing(fruit -> fruit.length())).get();
		System.out.println("-----------------------------------");

		System.out.println("Minimum : "+ minimum);

		System.out.println("-----------------------------------");

		String maximum = fruits.stream().max(Comparator.comparing(fruit -> fruit.length())).get();
		System.out.println("Maximum : "+ maximum);
		
	
		String reduced = fruits.stream()
		        .reduce((acc, fruit) -> acc +" "+ fruit).get();
		
		System.out.println("Result : " + reduced);

		
		String reducedfilter = fruits.stream()
			    .filter( fruit -> fruit.startsWith("B"))
			    .reduce("",(acc, fruit) -> acc + " " + fruit);

		System.out.println("Reduced Filter " + reducedfilter);
	}
}
