package com.thiskeyword.demo;

public class WithoutThisDemo {

	int rollNo;
	String name;
	int age;
	
	public WithoutThisDemo(int rn, String nm, int a) {
		rollNo = rn;
		name = nm;
		age = a;
	}
	
	public void display() {
		System.out.println("Roll no is : "+rollNo);
		System.out.println("name is : "+name);
		System.out.println("Age is : "+age);
	}
	
	public static void main(String[] args) {

		WithoutThisDemo s =new WithoutThisDemo (14, "Mayur", 25);
		
		s.display();
	}

}
