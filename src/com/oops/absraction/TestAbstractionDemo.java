package com.oops.absraction;

public class TestAbstractionDemo extends AbstractionDemo {

	
	public TestAbstractionDemo() {
		super();
	}

	public TestAbstractionDemo(int id, String name) {
		super(id, name);
		
	}

	public static void main(String[] args) {
		
		TestAbstractionDemo ob = new TestAbstractionDemo(20, "Narendra");
		ob.print();
	}

}
