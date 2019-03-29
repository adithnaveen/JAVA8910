package com.training.slidescode;

interface MyInterface {
	default void show() {
		showPrivate();
		showPrivateStatic();
	}

	// private method inside interface
	private void showPrivate() {  
        System.out.println("Hello, "
        	+ " I'm show of private method");  
    }

	private static void showPrivateStatic() {
		System.out.println("Show of privat static method ");
	}
	
}
