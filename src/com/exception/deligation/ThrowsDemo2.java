package com.exception.deligation;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		m1();
		System.out.println("Main method ended");

	}

	private static void m1() {
		System.out.println("m1 Started");
		m2();
		System.out.println("m1 Ended ");
	}
	private static void m2() {
		System.out.println("m2 Started");
		m3();
		System.out.println("m2 Ended ");
	}
	private static void m3() {
		System.out.println("m3 Started");
		m4();
		System.out.println("m3 Ended ");
	}
	private static void m4()throws ArithmeticException {
		System.out.println("m4 Started");
		
		int res = 20/0;
	
		System.out.println("m4 Ended ");
	}

}
