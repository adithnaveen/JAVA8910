package com.training.lambda;

/**
 * 
 * @author Naveen
 * @see Program to work with lambda's in detail
 */
public class LambdaExpressionDemo02 {
	public static void main(String[] args) {

		// version 1
		Executable ex = (a, b) -> {
			System.out.println("Your TODO Goes here");
			return a +b; 
		}; 
		
		// version 2
//		Executable ex =  ( a,  b) -> a + b; 

		int sum = ex.execute(100, 200); 
		System.out.println("Sum of given number " + sum);

		
		// version 3 
		// any interface for lambda expression can be mapped to Object class 
		Object ex1  = (Executable) ( a,  b) -> a + b; 
		

		System.out.println("Computation Result result stored in Object " + 
				((Executable) ex1).execute(200,300));
					
	}
}
