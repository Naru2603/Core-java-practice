package com.oops.inheritance.association;

public class Student2 {

	String clgName;
	float marks;
	StudentId id;  //Composition //aggregation
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student2(String clgName, float marks, StudentId id) {
		super();
		this.clgName = clgName;
		this.marks = marks;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student2 [clgName=" + clgName + ", marks=" + marks + ", id=" + id + "]";
	}

	
	
	
	
}
