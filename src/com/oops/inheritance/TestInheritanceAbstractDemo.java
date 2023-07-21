package com.oops.inheritance;

public class TestInheritanceAbstractDemo extends InheritanceAbstractDemo {

	
	public TestInheritanceAbstractDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void m2() {
		System.out.println("Inside m2() of TestInheritanceAbstractDemo");
	}
	
	public static void main(String[] args) {
	
		TestInheritanceAbstractDemo t = new TestInheritanceAbstractDemo("Narendra");
		
		t.m1();
		t.m2();

	}

}
