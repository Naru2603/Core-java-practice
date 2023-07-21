package com.exception.deligation;

public class ThrowDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		m1();
		System.out.println("main method ended");

	}
	public static void m1() {
		System.out.println("M1 started");
		
		try {
			System.out.println("Inside try block");
			
			int res = 20/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Airthmetic Exception occurred but converting it to NPE");
			throw new NullPointerException();
		}
	}

}
