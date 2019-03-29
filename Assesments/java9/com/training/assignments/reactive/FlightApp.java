package com.training.assignments.reactive; 

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class FlightApp {
	public static void main(String[] args) {

		SubmissionPublisher<Flight> publisher = 
					new SubmissionPublisher<>();

		// invoking the subscriber
		publisher.subscribe(new FlightProcess());

		List<Flight> flights = LoadData.getFlights();

		flights.stream().forEach(item -> {
			publisher.submit(item);
			sleep(500);

		});

		publisher.close();
		System.out.println("Exiting ");
	}

	private static void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
