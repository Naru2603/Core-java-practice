package com.oops.overriding;

public class OverridingDemo1 {

	public void show(int a, int b) {
		int sum = a+b;
		System.out.println("Inside show method of parent class");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.show(20,30);
		
		OverridingDemo1 o = new OverridingDemo1();
		o.show(40, 265);
		
	
		

		
	}
}

class Test extends OverridingDemo1{
	
	public void show(int x, int y) {
		
	super.show(x,y);
	int sum = x+y;
	System.out.println("Inside show method of child class");
}
	
}	