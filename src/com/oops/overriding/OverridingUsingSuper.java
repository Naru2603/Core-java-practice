package com.oops.overriding;

public class OverridingUsingSuper {
	
	public void display() {
		System.out.println("1");
	}
	
	public void show() {
		System.out.println("3");
	}
	
	public static void main (String [] args) {
		
		TestSuper t = new TestSuper();
		t.display();
		t.show();
	}
}
class TestSuper extends OverridingUsingSuper{
	
	public void display() {
		super.display();
		System.out.println("2");
	}
	
	public void show() {
		super.show();
		System.out.println(4);
	}
}
