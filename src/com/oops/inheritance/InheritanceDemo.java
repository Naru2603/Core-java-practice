package com.oops.inheritance;

public class InheritanceDemo {

	int salary;
	
	public void show(int salary) {
		this.salary = salary;
		System.out.println("Programmer salary is : "+salary);
	}
	
}
class Employee extends InheritanceDemo{
	int bonus = 10000;
	
	public void display(int bonus ) {
		this.bonus = bonus;
		System.out.println("Programmer bonus is : "+bonus);
		
	}


}
