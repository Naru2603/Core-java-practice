package com.oops.inheritance.single;

public class Circle {
	int r;
	double area;
	
	public void area(int r) {
		this.r = r;
		area = 3.14*r*r;
		System.out.println("Area is : "+area);
	}
}
