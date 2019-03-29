package com.training.optional;

import java.util.List;

public interface IBusinessLogic {
	List<String> getTravelPlaces(String state);

	String getCapitalCity(String state);
}
