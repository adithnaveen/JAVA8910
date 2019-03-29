package com.training.lambda;

/**
 * 
 * @author Naveen
 * @see Program to understand basic uses of lambda expression, 
 *     with two work flows 1. With Runner 2. Without Runner class 
 */
public class LambdaExpressionDemo01 {
	public static void main(String[] args) {
		Runner runner = new Runner(); 
	
		System.out.println("*********************************************");
		// old way of writing 
		runner.run(new SimpleExecutable() {
			
			@Override
			public int execute() {
				System.out.println("TODO in main");
				return 0;
			}
		});

		System.out.println("*********************************************");
		// in lambda way 
		runner.run(() -> {
			System.out.println("In anonymous main simple executable ddd");
			return 0;
		}); 
		
		System.out.println("*********************************************");
		SimpleExecutable se = new SimpleExecutable() {
			
			@Override
			public int execute() {
				System.out.println("In Main, simple exeuctable");
				return 0;
			}
		};
		
		se.execute(); 
		
		// in lambda way 
		System.out.println("*********************************************");
		SimpleExecutable se1 = () -> {
			System.out.println("In Main, SimpleExeuctable Lambda");
			return 0; 
		};
		
		se1.execute(); 
	}
}
