package com.superkeyword.demo;

public class SuperMethod {

	public void m1() {
		System.out.println("I am in Parent class");
	}
}
class Test1 extends SuperMethod{
	
	public void m1() {
		System.out.println("I am in child class");
	}
	
	public void show() {
		m1();
		super.m1();
	}
}