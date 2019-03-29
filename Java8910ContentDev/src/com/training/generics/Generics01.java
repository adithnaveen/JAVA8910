package com.training.generics;

import com.training.generics.demo.Generic;

public class Generics01 {
	public static void main(String[] args) {
		Generic<String> gen = new Generic<String>("Hello"); 
		System.out.println(gen.getObject());
	}
}
