package com.training.max;

public class MaxTest {

	public static void main(String[] args) {
		MaxFinder mf = (a,b)->a>b?a:b;
		System.out.println(mf.getMax(23, 54));
	}

}
