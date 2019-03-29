package com.training.introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Naveen
 * @see This program shall give the sum of all the numbers which is greater than
 *      10 and less than 100, in this example we are using iterative model, or
 *      call it as external iteration  in the method sumofNumberIteration, 
 *      then using stream API for the same result using java 8 function  
 *      sumofNumber, where we will see without lambda, sumofNumberLambda
 *      shows with lambda. 
 */

public class StreamAPIDemo {

	// first
	private static int sumofNumberIteration(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		// it will return the sum of all the numbers
		// greater than 10
		while (it.hasNext()) {
			int num = it.next();
			if (num >= 10 && num <= 100) {
				sum += num;
			}
		}
		return sum;
	}

	// second
	private static int sumofNumber(List<Integer> list) {

		return list.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num >= 10 && num <= 100;
			}

		}).mapToInt(num -> num).sum();

	}

	// third
	private static int sumofNumberLambda(List<Integer> list) {
		return list.stream().filter(num -> num >= 10 && num <= 100).mapToInt(num -> num).sum();
	}

	public static void main(String[] args) {

		System.out.println("Sum of Numbers "+ sumofNumber(Arrays.asList(12, 30, 4, 5, 600)));

	}
}
