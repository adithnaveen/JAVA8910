package com.training.typesoffunctionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	static String test(String message) {
		return "Hello " + message + " Welcome to functional programming ";
	}

	public static void main(String ar[]) {
		// Function interface with two String argument referring to test method.
		Function<String, String> fun = FunctionExample::test;
		// Call Function interface method apply by passing value.
		System.out.println(fun.apply("Madhulika"));
	}
}
