package com.oops.constructor.demo;

public class ConstructorChainingDemo {

	public ConstructorChainingDemo()
	{
		System.out.println("Java Was developed by James Goslin");
	}
	
	public ConstructorChainingDemo(int year) {
		this("Java", 1995);
		System.out.println("James Goslin is known as father of java");
	}
	
	public ConstructorChainingDemo(String name, int year) {
		this();
		System.out.println("At sun microsys in year 1995");
	}
	public void show() {
		System.out.println("Java is developed usig ANSI C");
	}
	
	public static void main(String[] args) {
		ConstructorChainingDemo c = new ConstructorChainingDemo(1995);
		c.show();

	}

}
