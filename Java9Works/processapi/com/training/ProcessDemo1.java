package com.training;

import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author Naveen
 * @see Program show 5 process from the system, and each of the process is iterated 
 *      and info of the same is retrived. 
 */



public class ProcessDemo1 {
	public static void main(String[] args) {

		
		ProcessHandle.allProcesses().filter(p -> p.info().
					command().isPresent()).limit(5).forEach((process) -> {
			System.out.println("Process id : " + process.pid());
			ProcessHandle.Info info = process.info();

			System.out.println("Command: " + info.command().orElse(""));
			
			String[] arguments = info.arguments().orElse(new String[] {});
			System.out.println("Arguments:");
			
			for (String arg : arguments)
				System.out.println("Arguement :" + arg);
			System.out.println("Command line: " + info.commandLine().orElse(""));
			System.out.println("Start time: " + info.startInstant().orElse(Instant.now()).toString());
			System.out.println("Run time duration (Millis) : " + info.totalCpuDuration().orElse(Duration.ofMillis(0)).toMillis());
			System.out.println("User :" + info.user().orElse(""));
			System.out.println("===========================================");
		});

	}
}