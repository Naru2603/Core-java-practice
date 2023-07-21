package com.oops.absraction;

public class TestAbstractClassDemo extends AbstractClassDemo{

	@Override
	public void print() {
		System.out.println("Im overriden method");
	}
	public static void main(String[] args) {
		
		TestAbstractClassDemo t = new TestAbstractClassDemo();
		t.print();
		t.printHello();
	}

}
