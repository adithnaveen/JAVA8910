package com.training.assignments;

import java.util.Scanner;

public class HalfPyramidExample {

	public static void printChars(int height) {
		int i, j;

		for (i = 0; i < height; i++) {
			for (j = 0; j <= i; j++) {

				System.out.print("^ ");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pyramid height");
		int height = sc.nextInt();
		printChars(height);

		sc.close();
	}
}