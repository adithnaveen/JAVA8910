package com.training;

import java.io.IOException;

// Slide Snippet 

public class ProcessAPI {
	public static void main(String[] args) throws IOException {
		ProcessHandle cProcess = ProcessHandle.current();
		System.out.println("Process Id is: " + cProcess.pid());
		System.out.println("Direct children are : " + cProcess.children());
		System.out.println("Class name is: " + cProcess.getClass());
		System.out.println("All processes are: " + ProcessHandle.allProcesses());
		System.out.println("Process info: " + cProcess.info());
		System.out.println("Is process still alive: " + cProcess.isAlive());
		System.out.println("Process's parent " + cProcess.parent());

	}
}
