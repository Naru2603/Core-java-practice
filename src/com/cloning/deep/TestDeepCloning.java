package com.cloning.deep;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad = new Address(5123, "Kolhapur", "India");
		
		Employee emp1 = new Employee(12, "Mayur", ad);
		System.out.println("Before changing address : "+emp1);
		
		Employee emp2 = (Employee) emp1.clone();
		System.out.println("Before changing address : "+emp2);
		
		System.out.println("Emp ref equality : "+ (emp1 == emp2));
		System.out.println("Address ref equality : "+ (emp1.address == emp2.address));
		
		emp1.address.city = "Mumbai";
		
		System.out.println("After changing address Emp1 : "+emp1);
		System.out.println("After changing address Emp2 : "+emp2);
	}

}
