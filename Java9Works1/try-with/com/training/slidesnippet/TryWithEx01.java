package com.training.slidesnippet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Naveen
 * @see Program to show working of try-with before java 9
 */

public class TryWithEx01 {
	public static void main(String[] args) throws IOException {
//		tryWith7Way();

		tryWith9Way();
		
	}



	private static void tryWith9Way() throws FileNotFoundException {
		final FileOutputStream fStream = new FileOutputStream("abc.txt");
		try (fStream) {
			String message = "Welcome to java9.";
			byte b[] = message.getBytes();
			fStream.write(b);
			System.out.println("File  is written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	

	private static void tryWith7Way() {
		try (FileOutputStream fStream = new FileOutputStream("abc.txt")) {
			String message = "Welcome to java9.";
			byte b[] = message.getBytes();
			fStream.write(b);
			System.out.println("File  is written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
