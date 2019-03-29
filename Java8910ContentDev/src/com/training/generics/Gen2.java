package com.training.generics;

class Gen2 extends Gen<String> {
	Gen2(String o) {
		super(o);
	}

	String getob() {
		System.out.print("You called String getob(): ");
		return ob;
	}
}

