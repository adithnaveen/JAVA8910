package com.training.optional;

import java.util.List;

import com.training.optional.bean.Place;

public class BusinessLogic implements IBusinessLogic {

	List<Place> places;

	public BusinessLogic(List<Place> places) {
		this.places = places;
	}

	@Override
	public List<String> getTravelPlaces(String state) {
		return findPlace(state).getPlacesToVisit();
	}

	private Place findPlace(String state) {
		for (Place temp : places) {
			if (temp.getState().equals(state)) {
				return temp; 
			}
		}
		return null;
	}

	@Override
	public String getCapitalCity(String state) {
		return findPlace(state).getCapital();  
	}

}
