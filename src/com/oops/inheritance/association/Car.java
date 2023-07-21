package com.oops.inheritance.association;

public class Car {

	String company;
	Engine engine;
	int model;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String company, Engine engine, int model) {
		super();
		this.company = company;
		this.engine = engine;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", engine=" + engine + ", model=" + model + "]";
	}
	
	
}
