package com.training.demo.exception;

/**
 * 
 * @author Naveen
 * @see This exception is thrown when resource printer is not available 
 */
public class PrinterException extends Exception {
	private String mss;

	public PrinterException(String mss) {
		super();
		this.mss = mss;
	}

	@Override
	public String toString() {
		return "PrinterException [mss=" + mss + "]";
	} 
	
	
}
