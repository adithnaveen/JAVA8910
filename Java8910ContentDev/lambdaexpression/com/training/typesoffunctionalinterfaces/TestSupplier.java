package com.training.typesoffunctionalinterfaces;

import java.util.function.Supplier;



// this class has two versions 1 without lambda 2. with lambda 

public class TestSupplier {
	public static void main(String[] args) {
//		 supplierV1();
		Supplier<Student> supplier =() -> { return new Student(101, "Kanchan", 77);}; 
		
		Student student = supplier.get(); 
		System.out.println(student);
	}

	private static void supplierV1() {
		Supplier<Student> supplier =new Supplier<Student>() {

			@Override
			public Student get() {
				return new Student(101, "Kanchan", 77); 
			}
		};
		
		Student student = supplier.get(); 
		System.out.println(student);
	}
}
