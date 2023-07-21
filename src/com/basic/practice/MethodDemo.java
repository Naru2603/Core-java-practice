package com.basic.practice;

public class MethodDemo {

	
	static {
		System.out.println("Inside static block 1");
	}
	
	
	{
		System.out.println("Inside instance block 1");
		
	}
	
	static {
		System.out.println("inside static block 2");
	}
	
	
	
	{
		System.out.println("Inside instance block 2");
	}
	
	 public void addition( int a, int b) {
		 int add=a+b;
		 System.out.println("Addistion is "+add);
	 }
	 
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		MethodDemo m=new MethodDemo();
		m.addition(10, 20);
		
		
	}
	public MethodDemo() {
		System.out.println("inside no arg constructor ");
	}
	
}
