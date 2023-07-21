package com.oops.constructor.demo;

public class PrivateConstructor {

	String name;
	int age;
	
	private PrivateConstructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
	
	public static void main(String[] args) {
		PrivateConstructor p =new PrivateConstructor("Rishi", 25);
		p.show();

	}

}
