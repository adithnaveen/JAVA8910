package com.training.slidesnippet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract class MyClass<T> {

	public abstract T showBalance(T accountNumber, T accountHolder);

}

public class AnonymousClass {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		MyClass<Object> myObject = new MyClass<>() {

			@Override
			public Object showBalance(Object accountNumber, Object accountHolder) {
				return accountNumber +", " + accountHolder;
			}
		};

		System.out.println(myObject.showBalance(101, "Harry"));
		
	}
}
