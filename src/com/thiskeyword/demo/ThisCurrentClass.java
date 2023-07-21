package com.thiskeyword.demo;

public class ThisCurrentClass {

	public void fly() {
		System.out.println("Birds are flying");
	}
	public void print() {
		this.fly();
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		
		ThisCurrentClass a = new ThisCurrentClass();
		a.print();

	}

}
