package com.training.methodreference;

class MyBusinessLogic {
	public void helloWorld() {
		System.out.println("Hello World from MyBusinessLogic");
	}
}

public class InstanceMethodReference {
	public static void main(String[] args) {

		MyBusinessLogic mbl = new MyBusinessLogic();
		MyInterface mi = mbl::helloWorld;
		mi.show();
	}
}
