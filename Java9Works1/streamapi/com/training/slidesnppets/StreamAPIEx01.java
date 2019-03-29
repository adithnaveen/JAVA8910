package com.training.slidesnppets;

import static java.util.stream.Collectors.toList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 
 * @author Naveen
 * @see Program shows working of using new stream methods with takeWhile, dropWhile, ofNullable. 
 * 	    generateNumbers(int) -> to generate number 
 * 		Inner class to have custom consumer 
 */
public class StreamAPIEx01 {
	public static void main(String[] args) {

		List<Integer> list1 = generateNumbers(10);

		System.out.println("---------- List1 takeWhile --------------");
		list1.stream().takeWhile(number -> number < 5).forEach(new MyConsumer());

		System.out.println("-----------List 1 dropWhile---------------");
		list1.stream().dropWhile(i -> i < 4).forEach(new MyConsumer());

		Stream<Integer> num2 = Stream.ofNullable(20);

		num2.forEach((x) -> System.out.println("Nullable Check with not null : " + x));

		// Note when the value is null below statements are not printed 
		Stream<Integer> num = Stream.ofNullable(null);
		num.forEach((x) -> System.out.println("Nullable Check with null : " + x));

		
		Map<String, String> penMap = new HashMap<>();

		penMap.put("Berol", "Europe");
		penMap.put("Ballograf", "Switzerland");
		penMap.put("OMAS", null);
		penMap.put("Classmate", "India");

		List<String> countryList = penMap
									.entrySet()
									.stream()
									.map(e -> e.getKey())
									.collect(toList());
		
		System.out.println("All Pens brand -> " +  countryList);
		
		System.out.println("---------------------------------------------");
		// using custom logic 
		List<String> penBrandList = penMap.entrySet().stream().flatMap(
					mapObject -> {
						if(mapObject.getValue() != null) {
							return Stream.of(mapObject.getValue());
						}else {
							return Stream.empty(); 
						}
					}).collect(Collectors.toList()); 
		
	
		System.out.println("List of Existing Pens -> " +penBrandList);

		System.out.println("---------------------------------------------");

		// using ofNullable instead of Custom logic 		
		List<String> penBrandList1 = penMap
							.entrySet()
							.stream()
							.flatMap(mapOjbect -> Stream.ofNullable(mapOjbect.getValue()))
							.collect(toList()); 
		
		System.out.println("List of Existing Pens (with ofNullable) -> " +penBrandList1);
		

	}

	// Generates the limit sized numbers staring from 1
	private static List<Integer> generateNumbers(int limit) {
		return Stream.iterate(1, i -> i + 1).limit(limit).collect(Collectors.toList());
	}

	private static class MyConsumer implements Consumer<Integer> {

		@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
	}

}
