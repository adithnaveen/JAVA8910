package com.training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Naveen
 * @see  Program to show working of ananymous classes and using lambda expression. 
 * To sort person object. 
 */
public class LambdaExample {

	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(
				new Person(101, "Harsha"),
				new Person(44, "Lakshmi"),
				new Person(78, "Sudhanshu"),
				new Person(100, "Ajay"),
				new Person(50, "Rick"),
				new Person(22, "Madhu")
		);

		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getpName().compareTo(o2.getpName());
			}

		});

		for (Person temp : personList) {
			System.out.println(temp);
		}
		
	/*	System.out.println("----------------------Descending order of Name---------------------------------");

		personList.sort((Person o1, Person o2) -> o1.getpName().compareTo(o2.getpName()));

		personList.forEach((person) -> System.out.println(person));*/
	}
}