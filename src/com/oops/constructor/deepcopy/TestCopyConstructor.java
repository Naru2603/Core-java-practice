package com.oops.constructor.deepcopy;

public class TestCopyConstructor {

	public static void main(String[] args) {
		
		Address addr = new Address(1234, "Pune", "India");
		
		Employee emp1 = new Employee(10, "Ram", addr);

		System.out.println("Before changing address Emp1 : "+emp1);
		
		Employee emp2 = new Employee(emp1);
	
		System.out.println("Before changing address Emp2 : "+emp2);
		
		System.out.println("Emp ref equality : "+ (emp1 == emp2));
		System.out.println("Address ref equality : "+ (emp1.address == emp2.address));
		
		emp1.address.city = "Mumbai";
		
		System.out.println("After changing address Emp1 : "+emp1);
		System.out.println("After changing address Emp2 : "+emp2);

	}

}
