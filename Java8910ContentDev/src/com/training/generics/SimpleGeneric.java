package com.training.generics;

// Here T can hold any object i.e., java.lang.Object 
public class SimpleGeneric <T>{
	
	T obj;

	public SimpleGeneric(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	} 
	
	
}
