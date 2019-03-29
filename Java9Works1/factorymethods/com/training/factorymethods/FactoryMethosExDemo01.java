package com.training.factorymethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Naveen
 * @see Program to show working of Factory method with List, Set, Map
 */
public class FactoryMethosExDemo01 {
	public static void main(String[] args) {

		listWorks();
//		setWorks();
//		mapWorks();

	}

	private static void mapWorks() {
		Map<String, String> map = Map.of("Mivi", "Head Phones", "Skull Candy", "Ear Phones", "Rode",
				"Condenser Microphone");
		map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		
		System.out.println("----------------------------------------------------");
		Map.Entry<Integer, String> e1 = Map.entry(101, "Li-Ning");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Yonex");

		//Create Map using map entries
		Map<Integer, String> map1 = Map.ofEntries(e1,e2);

		//Iterate Map
		for(Map.Entry<Integer, String> m1 : map1.entrySet()){
			System.out.println(m1.getKey()+", "+m1.getValue()); 
		}
	}

	private static void setWorks() {
		Set<String> mySet = new HashSet<String>();

		// Creating the set of Values
		// old way
		mySet.add("Aspheric");
		mySet.add("Photochromic");
		mySet.add("Polarized");
		mySet.add("Bifocals");
		mySet.add("Trifocals");

		System.out.println(mySet);

		// Java 8 way
		// duplicates are not considered but does not give error
		Set<String> mySet1 = Stream.of("Aspheric", "Photochromic", "Polarized", "Bifocals", "Trifocals")
				.collect(Collectors.toSet());

		System.out.println(mySet1);

		// Java 8 way - Immutable
		Set<String> mySet2 = Stream.of("Aspheric", "Photochromic", "Polarized", "Bifocals", "Trifocals", "Trifocals")
				.collect(Collectors.toUnmodifiableSet());
		// will throw an error when inserted
//		mySet2.add("Trifocals"); 

		System.out.println(mySet2);

		// Java 9 Way - Immutable (throws error) - Because of duplicate
		Set<String> mySet3 = Set.of("Aspheric", "Photochromic", "Polarized", "Bifocals", "Trifocals", "Trifocals");
		System.out.println(mySet3);
	}

	private static void listWorks() {
		// Creating the list of values
		// old way - Mutable
		List<String> myList = new ArrayList<String>();
		myList.add("Pen");
		myList.add("Pencil");
		myList.add("Eraser");
		myList.add("Ruler");
		myList.add("Compass");
		System.out.println(myList);

		// java 8 way - Mutable
		List<String> myList1 = Stream.of("Pen", "Pencil", "Eraser", "Ruler", "Compass").collect(Collectors.toList());
		System.out.println(myList1);

		// Java 8 Way - Immutable
		List<String> myListImmutable = Collections.unmodifiableList(
				Stream.of("Pen", "Pencil", "Eraser", "Ruler", "Compass").collect(Collectors.toList()));

		// if you have this statement, would throw error at runtime
//		myListImmutable.add("hello");

		// Java 9 way - Immutable
		List<String> myList2 = List.of("Pen", "Pencil", "Eraser", "Ruler", "Compass");
		System.out.println(myList2);
	}
}
