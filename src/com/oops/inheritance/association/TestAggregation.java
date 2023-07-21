package com.oops.inheritance.association;

public class TestAggregation {

	public static void main(String[] args) {
		
		Engine engine = new Engine(1.5f,1255,4);
		
		Engine engine2 = new Engine (2.5f,3500,6);
		
		Car c = new Car("Kia", engine, 2022);
		System.out.println(c);
		
		Car c2 = new Car("Skoda", engine2, 2020);
	}

}
