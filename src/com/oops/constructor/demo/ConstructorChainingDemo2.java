package com.oops.constructor.demo;

public class ConstructorChainingDemo2 {
	String stName;
	int stRollno;
	int stId;
	
	public ConstructorChainingDemo2(String schoolName) {
		this(2);
		System.out.println("Student's Detail: ");
	}

	public ConstructorChainingDemo2(int i) {
		System.out.println("New High School");
		
	}
	public ConstructorChainingDemo2(String stName, int stRollno, int stId) {
		this("DPS");
		this.stName = stName;
		this.stRollno = stRollno;
		this.stId = stId;
	}
	public void display() {
		System.out.println("Student name : "+stName);
		System.out.println("Student roll no is : "+stRollno);
		System.out.println("Student id is : "+stId);
	}
	public static void main (String [] args) {
		Student s =new Student("DPS");
		s.display();
	}
}
class Student extends ConstructorChainingDemo2{
	public Student() {
		super("Narendra", 1256, 25);
	}
	
	public Student(String schoolName) {
		this();
	}
	
	
}
