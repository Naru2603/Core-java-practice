package com.exception.finallydemo;

public class FinallyDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int res = m1();
		
		System.out.println(res);
		System.out.println("Main Method Ended");

	}

	private static int m1() {
		System.out.println("Inside m1 method");
		try {
			System.out.println("Inside try 1");
			int res = 10/0;
			System.out.println("Inside try 1");
			System.out.println("Inside try 1");
			return 10;
		}
		catch(Exception e) {
			System.out.println("Insdie Exception");
			return 20;
			
		}
		finally {
			System.out.println("Inside Finally block");
			return 30;
		}
		
	}

}
