package com.training.process;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

/**
 * 
 * @author Naveen
 * @see  This program is to get the process information like notepad, mspaint etc 
 * and this give the ProcessHandler.Info like time Command, absolute path etc. 
 * One you open the mspaint or notepad you can  save the changes, it get reflected 
 * ensure you have the file sample.png on the path specified or this will give an error 
 * 
 */


public class SampleProcessDemo {

	  public static void main(String[] args) 
		      throws InterruptedException, IOException
		   {
		      dumpProcessInformation(ProcessHandle.current());
		      Process p = new ProcessBuilder("mspaint.exe", 
		    		 "C:\\Users\\Naveen\\Desktop\\sample.png").start();
		      dumpProcessInformation(p.toHandle());
		      p.waitFor();
		      dumpProcessInformation(p.toHandle());
		   }

		   static void dumpProcessInformation(ProcessHandle processHandle)
		   {
		      System.out.println("----------------------------------------");
		      
		      System.out.println("Process ID : " + processHandle.pid());
		      
		      String processCommand = getProcessCommand(processHandle);
		      System.out.println("Process Command : " + processCommand);
		      
		      ProcessHandle.Info info = processHandle.info();
		      processInfo(info);
		   }

		private static void processInfo(ProcessHandle.Info info) {
			info.command().ifPresentOrElse
			      	(val -> System.out.println("Command Absolute Path: " + val), 
			      	()-> {System.out.println("No Command");}
		      );
		      
		      System.out.println("Start Time: "+ 
		                        info.startInstant().orElse(Instant.now()).toString());
		      
		      // Returns the total cputime accumulated of the process.
		      System.out.println("CPU Time To Execute : "+ 
		                        info.totalCpuDuration()
		                            .orElse(Duration.ofMillis(0)).toMillis() +", millis"); 
		      System.out.println("Command Owner: " +  
		                            	info.user().orElse("User Info Not Retrieved"));
		}

		private static String getProcessCommand(ProcessHandle processHandle) {
			String commandAbsolutePath  = processHandle.info().command().orElse(""); 
		      
			return commandAbsolutePath.substring(commandAbsolutePath.lastIndexOf("\\")+1,
					commandAbsolutePath.length()); 
		}
}
