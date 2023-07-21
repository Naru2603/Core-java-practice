package com.oops.overloading;

public class OverloadingDemo5 {

	public void show(StringBuffer a) {
		System.out.println("Inside String buffer method");
	}
	
	public void show(String b) {
		System.out.println("Inside string method ");
	}
	
	
	public static void main(String[] args) {
		
		OverloadingDemo5 a = new OverloadingDemo5();
		a.show("Rishi");
		
		a.show(new StringBuffer("ABD"));
	}

}
