package com.training.methodreference;

class MyBusinessLogic1{
	public void showUser(String userName) {
		System.out.println("User Name " + userName);
	}
	
	public void helloWorld() {
		System.out.println("Hello World from MyBusinessLogic");
	}
}

public class InstanceMethodReference2 {
	public static void main(String[] args) {

		MyBusinessLogic1 mbl = new MyBusinessLogic1(); 
		MyInterface mi = mbl :: helloWorld; 
		mi.show(); 
		
		Display display = mbl :: showUser; 
		display.showUser("Harry"); 
		
	}
}
