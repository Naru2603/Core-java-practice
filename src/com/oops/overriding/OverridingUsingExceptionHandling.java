package com.oops.overriding;

public class OverridingUsingExceptionHandling {

	 void m1() {
		System.out.println("M1 method of parent class is not throwing any exception");
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("M2 method of parent class is throwing Exception");
	}
	
	public void m3() throws RuntimeException{
		System.out.println("M3 method of parent class is throwing run time exception");
	}
	
	public static void main(String[] args) {

		Handling h = new Handling();
		h.m1();
		h.m2();
		h.m3();
		
		System.out.println("=========================");
		
		OverridingUsingExceptionHandling a = new OverridingUsingExceptionHandling();
		a.m1();
		a.m2();
		a.m3();
	}

}
 class Handling extends OverridingUsingExceptionHandling{
	 
	 protected void m1() throws IndexOutOfBoundsException{  //can not throw checked exception
		 System.out.println("m1 method of child class is throwing unchecked exception ");
	 }
	 
	 public void m2() throws IndexOutOfBoundsException{   //can throw same exception or  parent exception 
		 System.out.println("M2 method of child class is throwing Arithmetic Exception");
	 }
	 
	 public void m3() {
		 System.out.println("M3 method of child class is not throwing any exception");
	 }
 }