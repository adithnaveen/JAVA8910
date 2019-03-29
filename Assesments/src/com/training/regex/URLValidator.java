package com.training.regex;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
/**
 * To validate a URL e.g. : 
 * https://www.samplesite.com/
 * http://www.samplesite.com/
 * http://somesite.co
 * https://somesite.in 
 */
public class URLValidator {
	private String urlPattern = "^(https|http):\\/\\/(www.)?[a-z]+\\.(com|co|in)\\/?$";
    /*
    ^           start of line
    (https|http)Any of https or http, required
    : 			Colon, required
    \\/\\/		// required
    (www.)?		www. optional
    [a-z]+		a to z at least one
    \\.			a period, required
    (com|co|in)	Any of com, co or in, required
    \\/?		/ optional
    $            end of line
	*/
	private Pattern pattern;
	private Matcher matcher;
	public URLValidator() {
		pattern = Pattern.compile(urlPattern);
	}
	public boolean validateURL(String val) {
		boolean valid = true;
		matcher = pattern.matcher(val);
		valid = matcher.matches();
		return valid;
	}
	public static void main(String[] args) {
		URLValidator ht = new URLValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter URL");
		String hexString = scan.nextLine();
		System.out.println("URL valid : " + ht.validateURL(hexString));
	}
}
