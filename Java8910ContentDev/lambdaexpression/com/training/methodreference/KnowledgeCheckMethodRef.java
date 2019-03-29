package com.training.methodreference;

import java.util.Arrays;
import java.util.List;

public class KnowledgeCheckMethodRef {
	public static void main(String[] args) {

		List<String> str = Arrays.asList("a", "b", "A", "B");
		// Lambda
		str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

		str.forEach(System.out::println);

		// Equivalent Method Reference
		str.sort(String::compareToIgnoreCase);

		str.forEach(System.out::println);

	}
}
