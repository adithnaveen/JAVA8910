package com.training.demo.resource;

import com.training.demo.exception.PlotterException;
import com.training.demo.exception.ProjectorException;
import com.training.demo.exception.ScannerException;

/**
 * 
 * @author Naveen
 * @See CustomResource class is used to demonstrate the
 * behavior of the try-with-resources statement in Java
 * Note that this class implements AutoClosable which
 * is required with try-with-resources
 * 
 * List of Resources to check for 
 * printer - Available 
 * scanner - Not Available and exception is thrown in process method  
 * projector - Not Available and exception is thrown in close method 
 * plotter - Not Available and exception is thrown in process and close methods 
 */
public class CustomResource implements AutoCloseable{

	String resourceName; 
	
	public CustomResource(String resourceName) {
		this.resourceName = resourceName; 
	}
	
	// making the list of 
	public void process() throws ScannerException, PlotterException {
		System.out.println("Processing resource " + resourceName);
		
		if(resourceName.equalsIgnoreCase("printer"))  {
			System.out.println("Resource Granted " + resourceName);
			
		}else if(resourceName.equalsIgnoreCase("scanner")) {
			throw new ScannerException("Sorry Scanner Not Available"); 
		} else if(resourceName.equals("plotter")) {
			throw new PlotterException("Sorry Plotter Not Available");
		}
	}
	
	
	@Override
	public void close() throws ProjectorException, PlotterException{
		System.out.println("Closing Resource " + this.resourceName);
		
		if(resourceName.equalsIgnoreCase("projector")) {
			throw new ProjectorException("Sorry Prjector Resource Could Not Be closed"); 
		}else if(resourceName.equals("plotter")) {
			throw new PlotterException("Sorry Plotter Resource Could Not Be closed");
		}
		
	}
	
}
