package com.training.optional.bean;

import java.util.List;

public class Place {
	private String state; 
	private String capital; 
	private List<String> placesToVisit;
	
	
	public Place() {}
	public Place(String state, String capital, List<String> placesToVisit) {
		super();
		this.state = state;
		this.capital = capital;
		this.placesToVisit = placesToVisit;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getPlacesToVisit() {
		return placesToVisit;
	}
	public void setPlacesToVisit(List<String> placesToVisit) {
		this.placesToVisit = placesToVisit;
	}
	@Override
	public String toString() {
		return "Place [state=" + state + ", capital=" + capital + ", placesToVisit=" + placesToVisit + "]";
	} 
	
	
	
}
