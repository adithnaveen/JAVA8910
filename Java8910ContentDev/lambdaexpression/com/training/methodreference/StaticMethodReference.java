package com.training.methodreference;

public class StaticMethodReference {
	public static void sayHello() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		MyInterface myInterface = StaticMethodReference::sayHello;

		myInterface.show();
	}
}