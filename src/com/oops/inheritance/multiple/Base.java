package com.oops.inheritance.multiple;

public class Base implements I, J{

	public void m1() {
		System.out.println("Inside m1 of I");
	}
	
	public void m2() {
		System.out.println("Inside m2 of I");
	}
	public void m4() {
		System.out.println("Inside m4 of J");
	}
}
