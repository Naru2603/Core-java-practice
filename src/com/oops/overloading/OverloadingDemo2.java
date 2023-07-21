package com.oops.overloading;

public class OverloadingDemo2 {

	// changing the datatype 
	public void m1(int a, double b) {
		System.out.println("Inside first m1 method");
	}
	
	public void m1(String m,int a) {
		System.out.println("Inside second m2 method");
	}
	
	public static void main(String[] args) {

		OverloadingDemo2  a = new OverloadingDemo2();
		
		a.m1("Narendra", 100);

	}

}
