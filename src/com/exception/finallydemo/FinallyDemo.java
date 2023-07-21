package com.exception.finallydemo;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Inside main MEthod");
		m1();
		System.out.println(" Main method ended");

	}

	private static void m1() {
		
		System.out.println("Inside M1 method");
		int res=0;
		 try {
			 System.out.println("Inside try 1");
			 res= 10/0;
			 System.out.println("Inside try 1");
			 System.out.println("Inside try 1");
		 }
		 catch (Exception e) {
			 System.out.println("Inside exception");
		 }
		 finally {
			 System.out.println("Inside Finally block");
		 }
		System.out.println("M1 method ended");
	}

}
