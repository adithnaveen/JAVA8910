package com.training.regex;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
/**
 * To validate a Hexadecimal number e.g. 484AB2, fa31, FE23
 */
public class HexadecimalValidator {
	private String hexPattern = "^(?=.*[0-9])?(?=.*[a-f])?(?=.*[A-F])?(?=\\S+$).{1,}$";
    /*
    ^            start of line
    (?=.*[0-9])? At least one digit, optional
    (?=.*[a-z])? At least one lower case alphabet, optional
    (?=.*[A-Z])? At least one upper case alphabet, optional
    .{1,}        At least 1 character
    $            end of line
	*/
	private Pattern pattern;
	private Matcher matcher;
	public HexadecimalValidator() {
		pattern = Pattern.compile(hexPattern);
	}
	public boolean validateHex(String val) {
		boolean valid = true;
		matcher = pattern.matcher(val);
		valid = matcher.matches();
		return valid;
	}
	public static void main(String[] args) {
		HexadecimalValidator hv = new HexadecimalValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hexadecimal value");
		String hexString = scan.nextLine();
		System.out.println("Hex valid : " + hv.validateHex(hexString));
	}
}
