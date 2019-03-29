package com.training.loggers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class CustomApplication {
	private static final Logger logger = LogManager.getLogger(CustomApplication.class);

	public static void main(String[] args) {
		CRUDOperation crudOpr = new CRUDOperation();
		logger.trace("Starting Main Application");
		
		crudOpr.insert(new String("Harry"));

//		crudOpr.update(new String("Peter"));
		
		logger.trace("Exiting Main Application");
	}
}
