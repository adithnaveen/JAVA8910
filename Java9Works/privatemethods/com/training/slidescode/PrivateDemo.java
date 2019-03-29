package com.training.slidescode;


public class PrivateDemo implements MyInterface{
	public static void main(String[] args) {
		MyInterface myInterface = new PrivateDemo(); 
		
		myInterface.show(); 
	}
}
