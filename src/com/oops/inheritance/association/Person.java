package com.oops.inheritance.association;

public class Person {

	String name;
	int number;
	Address address;
	
	public Person(String name, int number, Address address) {
		this.name = name;
		this.number = number;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	
	
}
