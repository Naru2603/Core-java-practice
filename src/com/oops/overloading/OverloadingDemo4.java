package com.oops.overloading;

public class OverloadingDemo4 {

	public static void show(int [] array) {
		System.out.println("Inside int [] array method");
	}
	
	public static void show(char [] array) {
		System.out.println("Inside char [] array method");
	}
	
	public static void show(long [] array) {
		System.out.println("Inside long [] array method");
	}
	
	public static void show(double [] array) {
		System.out.println("Inside double [] array method");
	}
	
	public static void show(Object o) {
		System.out.println("Inside Object method");
	}
	
	public static void main(String[] args) {
		
		int [] num = {10,20,30,40};
		OverloadingDemo4 a = new OverloadingDemo4();
		a.show(num);
		
		char [] ch = {'a', 'b','c', 'd','e'};
		a.show(ch);
	}

}
