package com.training.regex; 

import java.util.regex.Pattern;

public class RegularExpressionDemo01 {

	public static void main(String[] args) {
		String matchAnyString =".*";
		String string1 = "hello"; 
		String string2 = "100"; 
		String string3 =""; 
		
		System.out.println("Mathing Any String ");
		System.out.println("------------------------------------------");
		System.out.println(Pattern.matches(matchAnyString, string1));
		System.out.println(Pattern.matches(matchAnyString, string2));
		System.out.println(Pattern.matches(matchAnyString, string3));
		
		String matchWithContent=".+";
		System.out.println("Mathing String With Content");
		System.out.println("------------------------------------------");
		System.out.println(Pattern.matches(matchWithContent, string1));
		System.out.println(Pattern.matches(matchWithContent, string2));
		System.out.println(Pattern.matches(matchWithContent, string3));
		
		String onlyNumbers="\\d+";
		System.out.println("Mathing Number With Content");
		System.out.println("------------------------------------------");
		System.out.println(Pattern.matches(onlyNumbers, string1));
		System.out.println(Pattern.matches(onlyNumbers, string2));
		System.out.println(Pattern.matches(onlyNumbers, string3));
	}
}


/*
 * 
 * 		String inputText = "welcome to introduction to regular expressions"; 

		String patternString = ".*to.*";
		
		System.out.println(Pattern.matches(patternString, inputText));
*/

