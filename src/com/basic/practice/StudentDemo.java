package com.basic.practice;

public class StudentDemo {
	
	int id;
	String name;

	
	public StudentDemo() {
		super();
		System.out.println("Iside no arg constructor");
		
	}

	public StudentDemo(int id, String nm) {
		this.id=id;
		this.name=nm;
		
		System.out.println("Inside all arg constructor");
	}
	
	public StudentDemo(int id) {
		this.id=id;
	}
	
	public StudentDemo(String nm) {
		this.name=nm;
	}
	
	public StudentDemo(String name, int id) {

		System.out.println("Inside all arg constructor");
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		
		StudentDemo s1= new StudentDemo();
		s1.id=10;
		s1.name="Narendra";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		
		StudentDemo s2= new StudentDemo();
		s2.id=20;
		s2.name="Korade";
			
		System.out.println(s2.id);
		System.out.println(s2.name);

		StudentDemo s3= new StudentDemo();
		s3.id=40;
		s3.name="Rishi";
			
		System.out.println(s3.id);
		System.out.println(s3.name);
		
		StudentDemo s4= new StudentDemo(546,"Barkya");
			
		System.out.println(s4.id);
		System.out.println(s4.name);
	}

}
