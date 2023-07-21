package com.oops.overloading;

public class OverloadingDemo6 {

	public void m1(Object a) {
		System.out.println("Inside object method");
	}
	
	public void m1(String b) {
		System.out.println("Inside String method");
	}
	public static void main(String[] args) {
		
		OverloadingDemo6 o = new OverloadingDemo6();
		o.m1('c');  //type promotion
	}

}
