package com.training.methodreference;

public class StaticMethodReferenceV1 {
	public static void sayHello() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {

		MyInterface myInterface = () -> StaticMethodReferenceV1.sayHello(); 
		myInterface.show(); 
	}
}
//Old way in java 
/*	
MyInterface myInterface1 = new MyInterface() {
	
	@Override
	public void show() {
		StaticMethodReferenceV1.sayHello(); 
	}
};

*/