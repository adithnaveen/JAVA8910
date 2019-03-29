package com.training.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo02 {

	public static void main(String[] args) {
		String inputText = "welcome to introduction to regular expressions";
		String patternString = ".*to.*";

		System.out.println(Pattern.matches(patternString, inputText));
		
//		1. write more regular expressions to check if its a valid name 
		String namePatternString = "[a-zA-Z]+";
		String name="NaveenKumar"; 
		System.out.println(Pattern.matches(namePatternString, name));
		
		//2. program to validate the transaction amount in a account 
		String numberPattern="[+-]?\\d+"; 
		String transactionAmount = "3000";
		System.out.println("Validating Number : "+Pattern.matches(numberPattern, transactionAmount));

		
	}
}
