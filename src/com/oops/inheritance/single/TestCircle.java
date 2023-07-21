package com.oops.inheritance.single;

public class TestCircle extends Circle {
	
	public void circumference(int r) {
		double circumference = 2*3.14*r;
		System.out.println("Cirmcumference of circle is : "+circumference);
	}
	public static void main(String[] args) {
		 
		TestCircle t =new TestCircle();
		t.area(15);
		t.circumference(12);

	}

}
