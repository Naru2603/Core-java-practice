package com.oops.inheritance.association;

public class StudentPOJO {

	private String name;
	private int rollNO;
	private int marks;
	
	public StudentPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPOJO(String name, int rollNO, int marks) {
		super();
		this.name = name;
		this.rollNO = rollNO;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentPOJO [name=" + name + ", rollNO=" + rollNO + ", marks=" + marks + "]";
	}
	
	
}
