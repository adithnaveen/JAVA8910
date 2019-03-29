package com.training.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo04 {
	public static void main(String[] args) {
		
		String [] contents = new String [] {
				"i live in bengaluru garden city of India", 
				"BENGALURU IS IT CAPITAL OF INDIA", 
				"One Of The Cosmopolitan City in India is Bengaluru"
		};

		String patternString ="bengaluru";
		
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE); 

		for(String temp : contents) {
		
			Matcher matcher = pattern.matcher(temp);
			while(matcher.find()) {
				
				System.out.println("Pattern String " + patternString  + 
						", Found from - " + matcher.start() +" to " + matcher.end());
			}
		}
		
	}
}
