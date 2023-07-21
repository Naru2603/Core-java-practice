package com.oops.constructor.demo;

public class CopyConstructorDemo {
	int id;
	String name;
	
	public CopyConstructorDemo(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public CopyConstructorDemo(CopyConstructorDemo c) {
		this.id = c.id;
		this.name = c.name;
	}
	
	public void show() {
		System.out.println(id +" " + name);
	}
	public static void main(String[] args) {
		
		CopyConstructorDemo c1 = new CopyConstructorDemo(1452, "Rishi");
		
		CopyConstructorDemo c2 = new CopyConstructorDemo(c1);
		
		c1.show();
		c2.show();

	}

}
