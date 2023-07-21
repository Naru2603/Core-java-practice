package com.thiskeyword.demo;

public class WithThisDemo {
	int id;
	String name;
	
	public WithThisDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
	}
	public static void main(String[] args) {
		
		WithThisDemo s = new WithThisDemo(124, "Rahul");
		s.show();
	}

}
