package com.training.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class CRUDOperation {
	private static final Logger logger = LogManager.getLogger(CRUDOperation.class);

	public boolean insert(Object object) {
		try {
			logger.info("Inserting "+ object);
			// Simulating the data is stored in DB
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true; 
		} catch (Exception e) {
			logger.error("Exception while inserting " + object, e);
		}
		return false; 
	}
	
	

	public boolean update (Object object) {
		try {
			logger.info("Updating " + object);
			// Simulating the data is updated in DB
			try {
				Thread.sleep(1000);
				throw new RuntimeException("RunTimException while updating " + object);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true; 
		} catch (Exception e) {
			logger.error("Exception while updating " + object, e);
		}
		return false; 
	}
}