package com.trainings.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationDemo {

	public static void main(String[] args) throws IOException {
		// writeToFile();
		// writeToFile01();
		writeToFile02();
//		 readFromFile01();
	}

	public static void writeToFile() {
		// earlier to 1.8

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter("Sample.txt"));

			bw.write("Hello");
			bw.newLine();
			bw.write("How are you today");
			bw.newLine();
			bw.write("Its nice weather in Bengaluru");
			bw.newLine();

			System.out.println("Data saved successfully... ");
		} catch (IOException ieo) {
			ieo.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void writeToFile01() throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("NewSample.txt"))) {
			bw.write("Hello All");
			bw.newLine();
			bw.write("We are in south India");
			bw.newLine();
			bw.write("In Bengaluru");
			bw.newLine();
		}

		System.out.println("Data Saved successfully.. ");
	}

	// java 8 way with Files 
	public static void writeToFile02() throws IOException {
		String message = "All that glitters is not gold.\nA rose by any other name would smell as sweet.";
		Files.write(Paths.get("Sample01.txt"), message.getBytes());
	}

	// using the classes but br.lines is a new addition to
	// java 8, and this is auto close of resources
	public static void readFromFile() throws IOException {

		try (
				FileReader fr = new FileReader("NewSample.txt"); 
				BufferedReader br = new BufferedReader(fr);
			) {
					br.lines().forEach(System.out::println);
		}
	}

	// readAllBytes will read the contents in one go
	// not like stream
	public static void readFromFile01() throws IOException {
		Path newFilePath = Paths.get("NewSample.txt");
		System.out.println("Message in file: \n" + new String(Files.readAllBytes(newFilePath)));

	}

}