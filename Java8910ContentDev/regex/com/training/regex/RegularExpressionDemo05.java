package com.training.regex;


import java.util.regex.Pattern;

public class RegularExpressionDemo05 {
	  public static void main(String[] argv) {

		  	String inputContent ="The most courageous act is\nstill to think for yourself.Aloud.";
	        System.out.println("INPUT: " + inputContent);

	        String [] pattern = {
	        		"self.aloud", 
	        		"is\nstill", 
	        		"^the.*aloud.$"
	        }; 

	        for(String temp : pattern) {
	        	System.out.println("----------------------------------------------");
	        	System.out.println("Pattern : " + temp);
	        	
	        	Pattern pattern1 = Pattern.compile(temp); 
	        	System.out.println("Default Match " +pattern1.matcher(inputContent).find());
	        	
	        	Pattern pattern2 = Pattern.compile(temp, 
	        		Pattern.DOTALL | Pattern.MULTILINE | Pattern.CASE_INSENSITIVE); 
	        	System.out.println("Special Match " + pattern2.matcher(inputContent).find());
	        }
	    }
}
