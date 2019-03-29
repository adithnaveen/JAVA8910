package com.training.methodreference;

import java.util.Arrays;
import java.util.List;

public class ConstructorMethodReference {
	public ConstructorMethodReference() {
		System.out.println("Hi i'm from Constructor");
	}

	public static void main(String[] args) {
		MyInterface mi = ConstructorMethodReference::new;

		mi.show();

	}
}
