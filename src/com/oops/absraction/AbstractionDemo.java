package com.oops.absraction;

public abstract class AbstractionDemo {

	int id;
	String name;
	
	
	public AbstractionDemo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AbstractionDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
}
