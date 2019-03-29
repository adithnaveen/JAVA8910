package com.training.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern matching 

public class RegularExpressionDemo03 {
	public static void main(String[] args) {
		String content1="i live in bengaluru garden city of India";
		String content2="BENGALURU IS IT CAPITAL OF INDIA";
		String content3="One Of The Cosmopolitan City in India is Bengaluru";
		
		String patternString =".*bengaluru.*";
		
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE); 
		
		Matcher matcher = pattern.matcher(content1); 
		System.out.println(matcher.matches());

		matcher = pattern.matcher(content2); 
		System.out.println(matcher.matches());
		
		matcher = pattern.matcher(content3); 
		System.out.println(matcher.matches());
		
	}
}
