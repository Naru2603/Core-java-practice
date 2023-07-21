package com.oops.inheritance;

public class InheritanceOverloading {

	int r;
	int a;
	int b;
	double area ;
	
	public void area(int r) {
		this.r = r;
		area = 3.14 * r*r;
		System.out.println("Area of circle is : "+area);
	}
	
	public static void main (String [] args) {
		
		Rectangle rc = new Rectangle();
		rc.area(11);
		rc.area(15,12);
	}
}

class Rectangle extends InheritanceOverloading{
	
	public void area (int a, int b) {
		this.a = a;
		this.b = b;
		area = a*b;
		System.out.println("Area of rectangle is : "+area);
	}
}
