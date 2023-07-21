package com.oops.overriding;

abstract class OverridingUsingAbstraction {

	abstract void area();
	
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("sum in abstract class is : "+sum);
	}
	
}
class TestAbstraction extends OverridingUsingAbstraction{
	
	public void area() {
		System.out.println("Overriden abstract method");
	}
	
	public void sum(int x, 		int y) {
		int sum = x+y;
		System.out.println("Sum in child class is : "+sum);
	}
	
	

}
