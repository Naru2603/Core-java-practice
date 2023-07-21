package com.superkeyword.demo;

public class SuperVariable {

	int id = 10;
	String name = "Narendra";
}

class Test extends SuperVariable{
	
	int id = 20;
	String name = "Mayur";
	
	public void display(String name) {
		System.out.println("Name set after object creation: "+name);
		System.out.println("Current class name : "+this.name);
		System.out.println("Super class name : " +super.name);
	}
	
	public void show() {
		System.err.println(super.id);
	}
}