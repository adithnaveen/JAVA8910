package com.training.assignments.reactive; 


import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class FlightProcess  implements Subscriber<Flight> {
	private Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription; 
		subscription.request(1);
	}

	@Override
	public void onNext(Flight item) {
		System.out.println("onNext [Flight] : " + item);
		this.subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		new Exception("Exception Occured in Flight ", throwable); 
	}

	@Override
	public void onComplete() {
		System.out.println("Finished Processing Given Flight");
	}

		
}
