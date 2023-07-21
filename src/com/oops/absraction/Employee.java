package com.oops.absraction;

public class Employee extends Person {

	public boolean isValidAge() {
		if(this.age >=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public Employee() {
		
	}
	public Employee(String name, int age, float height, int weight ) {
		super(name, age,height,weight);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Rishi",26,5.8f,82);
		e.printInfo();
		System.out.println(e.isValidAge());

	}

}
