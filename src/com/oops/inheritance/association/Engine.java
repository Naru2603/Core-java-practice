package com.oops.inheritance.association;

public class Engine {

	float capacity;
	int power;
	int numberOfCylinder;
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(float capacity, int power, int numberOfCylinder) {
		super();
		this.capacity = capacity;
		this.power = power;
		this.numberOfCylinder = numberOfCylinder;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", power=" + power + ", numberOfCylinder=" + numberOfCylinder + "]";
	}
	
	
}
