package com.oops.encapsulation;

public class EncapsulationDemo {

	private String name;
	private int age;
	private int number;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "The student details are: [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	
	
}
