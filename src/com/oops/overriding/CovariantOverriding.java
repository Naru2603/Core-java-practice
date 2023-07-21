package com.oops.overriding;

public class CovariantOverriding {

	public Object show() {
		return 5;
	}
	
	public Number display(int a) {
		return 60;
	}
	public static void main (String [] args) {
		child c = new child();
		System.out.println(c.show());
		
		System.out.println(c.display(10));
	}
}
class child extends CovariantOverriding{
	
	public String show() {
		return "narendra";
	}
	
	public Byte display(int b) {
		return 20;
	}
}
