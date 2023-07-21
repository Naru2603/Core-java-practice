package com.oops.inheritance;

class TestInheritanceInterfaceDemo implements InheritanceInterfaceDemo{

	public void m1() {
		System.out.println("Inside m1() of InheritanceInterfaceDemo1");
	}
	
	public void m2() {
		System.out.println("Inside m2() of InheritanceInterfaceDemo1");
	}
	
	public static void main (String [] args) {
		TestInheritanceInterfaceDemo i = new TestInheritanceInterfaceDemo();
		
		i.m1();
		i.m2();
	}
}
