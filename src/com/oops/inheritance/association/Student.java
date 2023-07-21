package com.oops.inheritance.association;

public class Student {

	String name;
	int rollNo;
	float marks;
	
	public Student (String name, int rollNo, float marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", mobNo=" + marks + "]";
	}
	
	
}
