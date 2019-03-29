package com.training.demo.exception;

public class ScannerException extends Exception {
	private String msg;

	public ScannerException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ScannerException [msg=" + msg + "]";
	} 
	
	
}
