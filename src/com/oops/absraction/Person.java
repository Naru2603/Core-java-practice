package com.oops.absraction;

public abstract class Person {

	String name;
	int age;
	float height;
	int weight;
	static String country ="India";
	
	
	public Person() {
		super();
	}


	public Person(String name, int age, float height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public abstract boolean isValidAge();
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.country);
	}
}
