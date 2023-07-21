package com.cloning.shallow;

public class Employee implements Cloneable{

	int empId;
	String name;
	Address address;
	String nm = "Narendra";

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException{

		Address add = new Address(416206,"rendal", "India");
		
		Employee e =  new Employee (52, "Rishi", add);
		System.out.println("Before changing the address : "+e);
		
		Employee e2 = (Employee) e.clone();
		System.out.println("Before changing the address : "+e2);
		
		System.out.println("Emp ref equality : "+ (e == e2));
		System.out.println("Address ref equality : "+ (e.address == e2.address));
		e.name = "Sham";
		e.address.city = "Mumbai";
		
		System.out.println("After changing address Emp1 : "+e);
		System.out.println("After changing address Emp2 : "+e2);
	}

}
