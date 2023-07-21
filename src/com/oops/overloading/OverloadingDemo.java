package com.oops.overloading;

public class OverloadingDemo {

	//changing the number of arguments 
	public void add(int a, int b) {
		int add = a+b;
		System.out.println("Inside first addition method");
		System.out.println("Addition is : "+add);
	}
	
	public void add(int a, int b , int c) {
		int add = a+b+c;
		System.out.println("Inside second addition method");
		System.out.println("Addition is : "+add);
	}
	
	public static void main (String [] args) {
		
		OverloadingDemo a = new OverloadingDemo();
		
		a.add(10, 19);
		a.add(25,40,23);
}
}


