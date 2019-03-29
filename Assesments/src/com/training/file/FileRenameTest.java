package com.training.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileRenameTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Directory Name");
		String dirName = scan.nextLine();
		File dir = new File(dirName);
		if (dir.exists() && dir.isDirectory()) {
			String[] dirList = dir.list();
			for (String fname : dirList) {
				File file = new File(dirName + "/" + fname);
				String fileName = file.getAbsolutePath();
				if (fileName.endsWith(".class")) {
					Path pth = Paths.get(fileName);
					String newName = fileName.replace(".class", ".oldclass");
					Path newPth = Paths.get(newName);
					try {
						Files.move(pth, newPth);
						System.out.println("File " + pth+" renamed to "+newName);
					} catch (IOException e) {
						System.out.println("Rename failed for " + fname);
					}
				}
			}
		} else {
			System.out.println("Directory " + dir + " does not exist");
		}

	}

}
