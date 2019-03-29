package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * 
 * @author Naveen
 * @see program has two methods, to show working of inputStream and printing environment
 * 	    variables of the system.  
 * 
 * inputStream() -> gives the list of files and folders of the dir command
 * printEnvDetails() ->  will invoke env and gives all the variables information 
 */
public class ProcessDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

//		inputStream();
		printEnvDetails();
	}

	private static void printEnvDetails() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("env");
		InputStream inputStream = process.getInputStream(); 
		int inputStreamSize = 1024; 
		try {
			byte[] bytes = new byte[inputStreamSize * 2];
			
			int len;
			while ((len = inputStream.read(bytes)) != -1) {
				System.out.write(bytes, 0, len);
			}
		}catch(IOException ioe) {
			ioe.printStackTrace(); 
		}finally {
			inputStream.close(); 
		}
	}



	private static void inputStream() throws IOException {
		Runtime rt = Runtime.getRuntime();
		Process process = rt.exec("dir ..");
		InputStream in = process.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		while ((line = br.readLine()) != null)
			System.out.println(line);
		br.close();

		// commenting waitFor might throw an exception
		// if you dont  wait for the process to end some time it might 
		// throw you an exception 
//		lsProc.waitFor();
		System.out.println("Exited with: "+process.exitValue());
	}
}