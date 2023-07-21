package com.oops.inheritance;

public abstract class InheritanceAbstractDemo {
	String name;
	public InheritanceAbstractDemo(String name) {
		this.name = name;
		System.out.println("Name is : "+name);
	}
	public void m1() {
		System.out.println("Inside m1() of InheritanceAbstractDemo");
	}
	
	 public abstract void m2();
}
