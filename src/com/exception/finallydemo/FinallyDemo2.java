package com.exception.finallydemo;

public class FinallyDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		m1();
		System.out.println("Main Method Ended");

	}

	private static void m1() {
		
		System.out.println("Inside m1");
		try
		{
			System.out.println("Inside try 1");
			int i = 10;
			System.out.println(i);
			if(i != 10) {
				System.exit(0);
			}
			System.out.println("Inside try 2");
			System.out.println("Inside try 3");
		}
		catch(Exception e) {
			System.out.println("Inside exception");
		}
		finally {
			System.out.println("Inside Finally Block");
		}
		System.out.println("M1 method ended");
	}
}
