package com.training.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.training.optional.bean.Place;

/**
 * 
 * @author Naveen
 * @see There are two methods in this program 1. old way where we consider writing if condition to 
 *    	handle things 2. with optional classes 
 */
public class Main {
	static List<Place> places = Arrays.asList(
			new Place("Karnataka", "Bengaluru", Arrays.asList("Mysuru", "Mangaluru", "Belagavi", "Tumakuru")),
			new Place("Rajasthan", "Jaipur", Arrays.asList("Jodhpur", "Kota", "Bikaner", "Udaipur")),
			new Place("Virginia", "Richmond",
					Arrays.asList("Orange County", "Prince Edward County", "Williamsburg", "Redford")),
			new Place("Andra", "Hyderabad", Arrays.asList("Vizag",  "Ananthpura")),
			new Place("Nauru", null, null));
	
	
	static IBusinessLogic service = null; 
	public static void main(String[] args) {

		service = new BusinessLogic(places);

//		System.out.println(service.getCapitalCity("Karnataka"));

		String city = "Karnataka"; 
//		oldWay(service, city);
//		withOptionals(service, city);
		
//		 working with of()
//		Optional<String> mystring = Optional.of("myString"); 
//		mystring.get(); 
		
		// chaining with optional 
//		chainingWithOptional(places.get(0).getPlacesToVisit());
		
		newFeaturesJava9("Bengaluru"); 
	}

	/*
	 * This method does exactly as same with oldWay(), but you dont 
	 */
	private static void withOptionals(IBusinessLogic service, String city) {
		List<String>  listOfCities  = Optional.ofNullable(service.getTravelPlaces(city)).orElseGet(ArrayList :: new);
		for (String temp : listOfCities) {
			System.out.println(temp);
		}
	}

	/*
	 *  This Method would check with if condition 
	 */
	private static void oldWay(IBusinessLogic service, String city) {
		List<String> listOfCities = service.getTravelPlaces(city);
		if (listOfCities != null) {
			for (String temp : listOfCities) {
				System.out.println(temp);
			}
		}else {
			System.out.println("No Cities Found ");
			listOfCities = new ArrayList<>(); 
		}
	}
	
	// showing usage of chaining, preferably show this with typing 
	public static void chainingWithOptional(List<String> places) {
		 for(String temp : places) {
			 
			 Function<String, String> cityWith8Chars = (String s) -> {return s.length()>8?s:null; };
			 Function<String, Integer> cityHasPattern = s -> s.indexOf("a"); 
			 
			 
			 String valid = cityWith8Chars.apply(temp); 
			 
			 Optional<String> customOptional = Optional.ofNullable(cityWith8Chars.apply(temp));
			 
//			 This statement shall throw null pointer exception as there will not be any values 
//			 System.out.println(valid.toUpperCase());
			 
			 // shall show values only present but with if-else condition 
			 if(customOptional.isPresent()) {
				 customOptional.ifPresent(System.out :: println);
			 }else {
				String s = customOptional.orElse("Value Not Present");
				System.out.println(s);
			 }
			 
//			 shall show the values only present and chaining 
			 Optional chainOptionals = Optional.ofNullable(cityWith8Chars.apply(temp)).map(cityHasPattern); 
			 chainOptionals.ifPresent(System.out :: println);
			 chainOptionals.orElse("Value Not Found"); 
		 }
	}
	
	
	/*
	 * Introduced in java 9 
	 * https://docs.oracle.com/javase/9/docs/api/java/util/Optional.html
	 * 1. ifPresentOrElse
	 * 2. or
	 * 3. stream
	 */
	private static void newFeaturesJava9(String capital) {
		/*
		 * Will check for value if found then prints the value, if not else part(runnable), 
		 * till java 8 it was two statements. 
		 */
		
		Optional<String> optional = Optional.ofNullable(capital); 
		optional.ifPresentOrElse(System.out:: println, () -> {System.out.println("No Capital Found For this State");});
		
		// similar approch with or () 
		Supplier<Optional<String>> elseString = () -> Optional.of("Sorry No Capital");
		System.out.println("Retunred from or() : "+optional.or(elseString).get()); 

		// try with null, it returns empty list since we are using stream 
		Optional<String> stateCapital = Optional.ofNullable(capital); 
		
		List<String> collect = stateCapital.stream().map((temp) -> temp.substring(0,3))
					.map(String :: toUpperCase)
				.collect(Collectors.toList()); 

		System.out.println("Short code of capital " + capital +", is " + collect);

	}
}
