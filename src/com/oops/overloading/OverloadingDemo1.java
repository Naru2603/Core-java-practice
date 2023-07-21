package com.oops.overloading;

public class OverloadingDemo1 {

	public void area (int a, int b) {
		int area = a*b;
		System.out.println("Area of reactangle is : "+area);
	}
	
	public void area (int r) {
		double area = 3.14*r*r;
		System.out.println("Area of circle is : "+area);
	}
	public static void main(String[] args) {
		
		OverloadingDemo1 o = new OverloadingDemo1();
		o.area(25);
	}

}
