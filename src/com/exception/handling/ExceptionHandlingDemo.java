package com.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 3");
		System.out.println("hello 4");
		
		int res= Division(10, 0);
		
		System.out.println("hello 5");
		System.out.println("hello 6");
		System.out.println("hello 7");
		}

	private static int Division(int a, int b) {
		
		int res = 0;
		try {
			res = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Number can not be devided by Zero");
		}
		return 0;
	}

}
