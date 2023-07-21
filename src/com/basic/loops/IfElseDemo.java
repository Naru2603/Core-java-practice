package com.basic.loops;

public class IfElseDemo {

	public static void main(String[] args) {
		
		if(isValidVooter(18)) {
			System.out.println("Voter is valid");
		}
		else 
		{
			System.out.println("Voter is invalid");
		}
		
		
	}



	public static boolean isValidVooter(int age) {
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
