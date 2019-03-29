package com.training.generics;

class Gen<T> {
	T ob;  
	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}
}
/*

class Delete{
	public static void main(String[] args) {
		 Gen<Integer> gens[] = new Gen<Integer>[10];
		 
		 Gen<?> gens1[] = new Gen<?>[10];
	}
}

class MyException<T> extends Throwable{}*/