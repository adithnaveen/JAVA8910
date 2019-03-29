package com.training.assignments.reactive; 

import java.util.List;

public class LoadData {
	// Simulating the data would be taken from external resource 
	
	public static List<Flight> getFlights(){
		return List.of(
				new Flight("Paris", 411), 
				new Flight("Dallas", 234), 
				new Flight("Washinton", 333), 
				new Flight("Muscat", 123), 
				new Flight("Colombo", 223)
				); 
		
	}
	


}	
