package com.training.typesoffunctionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	static Boolean cAge(int age) {
		if (age >= 18)
			return true;
		else
			return false;
	}

	public static void main(String ar[]) {
		// Predicate interface
		Predicate<Integer> predicate = PredicateExample::cAge;
		// Predicate method call and check the output.
		boolean result = predicate.test(30);
		System.out.println(result);
	}
}
