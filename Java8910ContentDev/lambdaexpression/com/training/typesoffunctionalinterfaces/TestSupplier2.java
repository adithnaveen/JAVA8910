package com.training.typesoffunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplier2 {
	public static void print(Supplier<?> arg) {
		System.out.println(arg.get());
	}
	public static void main(String[] args) {

		List<Person> personList = Arrays.asList(
				new Person(101, "Harsha"),
				new Person(44, "Lakshmi"),
				new Person(78, "Sudhanshu"),
				new Person(100, "Ajay"),
				new Person(50, "Rick"),
				new Person(22, "Madhu")
		);
		
		personList.forEach(temp -> print(() -> temp));
		Arrays.asList("hi", "how", "are", "you", "today")
			.forEach(temp -> print(() -> temp));
		
	}
}
