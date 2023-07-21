package com.string.practical;

import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the password");
		String password = sc.next();
		
		int passwordStrength = password.length();
		
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasDigit = false;
		boolean hasSpecialcharacter = false;
		
		for (int i=0; i<password.length(); i++) {
			char c= password.charAt(i);
			
			if(Character.isUpperCase(c)) {
				hasUppercase = true;
			}
			else if(Character.isLowerCase(c)) {
				hasLowercase = true;
			}
			else if(Character.isDigit(c)) {
				hasDigit = true;
				
			}
			else {
				hasSpecialcharacter = true;
			}
			
		}
		
			int StrengthCore=0;
			
			if(password.length()>=8) {
				StrengthCore++;
			}
			
			if(hasUppercase) {
				StrengthCore++;
			}
			
			if(hasLowercase) {
				StrengthCore++;
			}
			
			if(hasDigit) {
				StrengthCore++;
			}
			
			if(hasSpecialcharacter) {
				StrengthCore++;
			}
			
			String StrenghtLabel;
			
			switch(StrengthCore) {
			
			case 1: StrenghtLabel= "very Weak";
					break;
			case 2: StrenghtLabel= " Weak";
					break;
			case 3: StrenghtLabel= "Medium Weak";
					break;
			case 4: StrenghtLabel= "Strong";
					break;
			case 5: StrenghtLabel= "very Strong";
					break;
					
			default: StrenghtLabel="Invalid Password";
			break;
			}
			
			System.out.println("password Strenght :"+ StrenghtLabel);
	}		

}
