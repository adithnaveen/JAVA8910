package com.training.var;

import java.util.HashMap;

/**
 * 
 * @author Naveen
 * @see Working with local variables and knowing pros and cons
 */
public class LocalVariables {
	public static void main(String[] args) {

		// old code & new code for variable declaration
		int oldNum = 100;
		System.out.println(oldNum);

		// cannot have var without initialization this way the type check would happen
		// internally
		var newNum = 100;
		System.out.println(newNum);

		// not allowed
//		var num1=0, num2=0; 

		// no different type re-assignment
//		var intVar = 10; 
//		 intVar = "Hello"; 

		// old code & new code for loops
		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();

		for (var i = 0; i < 10; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();

		// old code & new code for declaring maps
		HashMap<String, Integer> oldMap = new HashMap<String, Integer>();

		var newMap1 = new HashMap<String, Integer>();

		// it is pretty much like raw/object, you cannot have type safe
		var newMap2 = new HashMap<>();
		newMap2.put("Harry", 2000);

		// vars with methods
		var returnValue = addNumber(10, 20);
		System.out.println("Addition Value " + returnValue);

		testClassTypes();
		
		arrays();
		
		
	}

	// you cannot return var,
	private static int addNumber(int i, int j) {
		return i + j;
	}

	// var with instance of classes

	private static void testClassTypes() {
		var x = new String("Hello World");
		System.out.println(x.getClass().getName());

//		https://docs.oracle.com/javase/9/docs/api/java/lang/Integer.html
		// depricated from java 9
//		Integer dd = new Integer(34); 

		var iy = Integer.valueOf(34);
		System.out.println(iy.getClass().getName());
	}

	// workingWithArrays
	private static void arrays() {
		int[] arr = {10,20,30,40};
		for (var temp : arr) {
			System.out.print("\t" + temp);
		}
	}

	// cannot pass var as parameter 
//	private static void (var variable) {
//		System.out.println(variable);
//	}
}
