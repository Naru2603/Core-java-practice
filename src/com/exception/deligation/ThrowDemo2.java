package com.exception.deligation;

import java.io.IOException;

public class ThrowDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		try {
		m1();
		}
		catch (IOException e) {
			System.out.println("IO Exception Occucred ");
		}
		System.out.println("Main method ended");
	}

	public static void m1() throws IOException {
		System.out.println("Inside mm1 method");
		
		try {
			System.out.println("Inside try");
			int res = 20/0;
			
		}
		catch (ArithmeticException e) {
			System.out.println(" Arithetic Exception occurred but converting it to IO Exception");
			throw new IOException();
		}
	}
}
