package com.training.demo.exception;

public class PlotterException extends Exception {
	private String msg;

	public PlotterException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "PlotterException [msg=" + msg + "]";
	} 
	
}
