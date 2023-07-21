package com.oops.Interface;

public interface NestedInterface {

	void display();
	
	interface Sum{
		void sum();
	}
}
class Test1 implements NestedInterface{
	
	public void display() {
		System.out.println("Inside display method of test1");
	}
	
	public void sum() {
		System.out.println("Inside sum method of test1");
	}
}
class Test2 implements NestedInterface.Sum{
	
	public void sum() {
		System.out.println("Inside sum method of Test2");
	}
	
	public void display() {
		System.out.println("Inside display method of test2");
	}
}