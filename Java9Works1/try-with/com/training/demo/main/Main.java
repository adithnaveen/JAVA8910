package com.training.demo.main;

import java.util.Arrays;
import java.util.List;

import com.training.demo.exception.PlotterException;
import com.training.demo.exception.ProjectorException;
import com.training.demo.exception.ScannerException;
import com.training.demo.resource.CustomResource;

public class Main {
	public static void main(String[] args) {

		List<String> resourceList = Arrays.asList("printer", "scanner", "plotter", "projector");

		// Before Java 7
		beforeJDK7(resourceList);
		System.out.println("*********************************************");

		// With Java 7/8/9 - Default
		withJava7Resource(resourceList);

		System.out.println("*********************************************");

		// With Java 7/8/9 - showing suppressed exception handle
		withJava7ResourceSuppressed(resourceList);
		System.out.println("*********************************************");

		// Java 9
		withJava9(resourceList);
	}

	/*
	 * With Java 9 the resource declaration can be done outside the try block, 
	 * how ever it should be final for the code to compile  
	 *  This is because the compiler MUST be sure about
     *   which close method to call.
	 */
	private static void withJava9(List<String> resourceList) {
		System.out.println("With Java 9 - Try Resource");
		for(String resource : resourceList) {
			System.out.println("-------------------------------");

		CustomResource customResource = new CustomResource(resource); 
		
				try (customResource){
					customResource.process();
					// Note that instantiating customResource here shall give compile time error 
//					customResource = new CustomResource(resource); 
				} catch (ScannerException | PlotterException |ProjectorException  e) {
					printException(e);
				} 
	
		}
	}

	/*
	 * This method works exactly as withJava7Resource, plus shown the suppressed
	 * message from the close() method of CustomResource
	 */
	private static void withJava7ResourceSuppressed(List<String> resourceList) {
		// With Java 7 (try-with)
		System.out.println("With Java 7 - Try Resource - Suppressed Message ");
		for (String resource : resourceList) {
			System.out.println("-------------------------------");

			try (CustomResource customResource = new CustomResource(resource)) {
				customResource.process();
			} catch (ProjectorException | PlotterException | ScannerException e) {
				printException(e);
				Arrays.asList(e.getSuppressed()).forEach((msg) -> System.out.println(msg));
			}

		}
	}

	/*
	 * With Java 7, notice that the object creation is in try statement, and we have
	 * missed the finally block.
	 * 
	 * Since the class CustomReource is implementing AutoCloseable the close method
	 * would be called implicitly.
	 * 
	 * And notice for the execution of "plotter" the exception message is not shown
	 * from the close method which is suppressed
	 * 
	 */
	private static void withJava7Resource(List<String> resourceList) {
		// With Java 7 (try-with)
		System.out.println("With Java 7 - Try Resource ");
		for (String resource : resourceList) {
			System.out.println("-------------------------------");

			try (CustomResource customResource = new CustomResource(resource)) {
				customResource.process();
			} catch (ProjectorException | PlotterException | ScannerException e) {
				printException(e);
			}

		}
	}

	/*
	 * Typical method which has try-catch-finally block where the resources which
	 * used are closed in finally
	 */
	private static void beforeJDK7(List<String> resourceList) {
		System.out.println("Before Java 7 ");
		for (String resource : resourceList) {
			System.out.println("-------------------------------");
			CustomResource customResource = null;

			try {
				customResource = new CustomResource(resource);
				customResource.process();
			} catch (ScannerException e) {
				printException(e);
			} catch (PlotterException e) {
				printException(e);
			} finally {
				try {
					customResource.close();
				} catch (ProjectorException e) {
					printException(e);
				} catch (PlotterException e) {
					printException(e);
				}
			}
		}
	}

	private static void printException(Exception e) {
		System.out.println(e);
	}

}
