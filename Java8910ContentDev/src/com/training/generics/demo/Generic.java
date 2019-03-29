package com.training.generics.demo;

public class Generic<T> {
	T object;

	public Generic(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	@Override
	public String toString() {
		return "Generic [object=" + object + "]";
	}
}
