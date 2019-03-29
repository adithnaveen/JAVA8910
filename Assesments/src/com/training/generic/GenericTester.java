package com.training.generic;

public class GenericTester {

	public static void main(String[] args) {
		Basket<Integer> intBasket = new Basket<>();
		intBasket.setData(120);
		System.out.println("data: " + intBasket.getData());
		Basket<String> stringBasket = new Basket<>();
		stringBasket.setData("Bangalore");
		System.out.println("data: " + stringBasket.getData());
	}

}
