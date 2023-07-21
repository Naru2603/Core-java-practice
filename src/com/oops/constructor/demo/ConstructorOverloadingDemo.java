package com.oops.constructor.demo;

public class ConstructorOverloadingDemo {

	int id;
	String name;
	int age;
	
	public ConstructorOverloadingDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ConstructorOverloadingDemo(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		ConstructorOverloadingDemo c1 = new ConstructorOverloadingDemo(1234,"Narendra");
		
		ConstructorOverloadingDemo c2 = new ConstructorOverloadingDemo(5231, "Rishi", 12);
		
		c1.display();
		c2.display();
		

	}
	private void display() {
		System.out.println("Id is :"+ id);
		System.out.println("Name is :"+ name);
		System.out.println("Age is :"+ age);
	}

}
