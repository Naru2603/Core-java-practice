package com.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheckerUsingRegex {
	
	public static void main (String [] args) {

	boolean res = isValidPassword("Narendra@123");
	
	if(res) {
		System.out.println("Valid Password");
	}
	else {
		System.out.println("Invalid Password");
	}

}

private static boolean isValidPassword(String inputPwd) {
	
	Pattern pattern =Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
	Matcher matcher= pattern.matcher(inputPwd);
	
	boolean res=matcher.find();
	
	return res;
}

}
