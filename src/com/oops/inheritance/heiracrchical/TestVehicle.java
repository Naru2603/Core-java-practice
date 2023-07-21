package com.oops.inheritance.heiracrchical;

public class TestVehicle {

	public static void main(String[] args) {
		
	Car c = new Car ();
	c.display();
	c.drive();
	
	System.out.println("===================");
	
	Vehicle v = new Vehicle();
	v.display();
 
	System.out.println("===================");
	
	Bike b = new Bike();
	b.display();
	b.ride();
	}

}
