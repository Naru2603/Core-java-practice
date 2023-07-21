package com.oops.inheritance;

public class InheritanceOverrideing {

	int r ;
	double  area;
	
	public void area(int r) {
		this.r = r;
		area = 3.14*r*r;
		System.out.println("Area in parent class is  : "+ area);
	}
	
	public static void main (String [] args) {
		Circle cr= new Circle();
		
		cr.area(15);
		cr.circumference(11);
	}
}
class Circle extends InheritanceOverrideing{
	
	int c;
	
	public void area(int c) {
		this.c = c;
		area = 3.14*c*c;
		System.out.println("Area in child class is  : "+ area);
	}
	
	public void circumference(int c) {
		this.c = c;
		double circumference = 2*3.14*c;
		System.out.println("circumference in child class is  : "+ circumference);
	}
}