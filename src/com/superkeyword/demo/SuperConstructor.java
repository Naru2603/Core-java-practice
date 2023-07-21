package com.superkeyword.demo;

public class SuperConstructor {

	public  SuperConstructor() {
		System.out.println("I am in parent class constructor");
	}
}
class Test2 extends SuperConstructor{
	
	public Test2() {
		super();
		System.out.println("I am in child class constructor");
	}
}
