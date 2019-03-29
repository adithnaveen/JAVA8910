package com.training.demo.exception;


/**
 * 
 * @author Naveen
 * @see This exception is thrown when resource projector is not available 
 */

public class ProjectorException extends Exception {
	private String msg;

	public ProjectorException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ProjectorException [msg=" + msg + "]";
	} 
	
}
