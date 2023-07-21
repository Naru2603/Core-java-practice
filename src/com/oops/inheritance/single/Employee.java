package com.oops.inheritance.single;

public class Employee {

	private String name;
	private int id;
	private int salary;
	
	public void display(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		
		System.out.println("Name is :"+name);
		System.out.println("Id is : "+id);
		System.out.println("Salary is :"+salary);
	}
}
