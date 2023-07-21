package com.oops.overriding;

public class OverridingUsingAccessModifiers {

	 void area(int a, int b) {
		double area = a*b;
		System.out.println(" Area of rectangle in parent class is : "+area);
	}
	
	protected void sum(int x, int y) {
		int sum = x+y;
		System.out.println("Sum in parent class is : "+ sum);
	}
	public static void main (String [] args) {
		TestOverridingUsingAccessModifiers t = new TestOverridingUsingAccessModifiers();
		t.area(20,10);
		t.sum(25,20);
		
		OverridingUsingAccessModifiers o = new OverridingUsingAccessModifiers();
		o.area(5, 30);
	}
}
class TestOverridingUsingAccessModifiers extends OverridingUsingAccessModifiers{
	
	protected void area (int i, int j) {
		super.area(10, 25);
		double area = i*j;
		System.out.println("Area of rectangle in child class is : "+area );
	}
	
	public void sum(int m, int n) {
		int sum = m+n;
		System.out.println("Sum in child class is : "+sum);
		
		System.out.println("===============================");
	}
}