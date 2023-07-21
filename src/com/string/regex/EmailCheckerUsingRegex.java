package com.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckerUsingRegex {

	public static void main(String[] args) {
		
		boolean res = isValidemail("narendra.korade12@gmail.com");
		
		if(res) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}

	}

	private static boolean isValidemail(String inputEmail) {
		
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher=pattern.matcher(inputEmail);
		
		boolean res=matcher.find();
		
		return res;
	}

}
