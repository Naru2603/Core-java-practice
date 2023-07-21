package com.oops.constructor.deepcopy;

public class Employee {

	int empId;
	String name;
	Address address;
	
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
	
	public Employee (Employee emp) {
		this.empId = emp.empId;
		this.name = emp.name;
	//	this.address = emp.address; // shallow cloning
		
		Address ad = new Address();
		ad.pin = emp.address.pin;
		ad.city = emp.address.city;
		ad.country = emp.address.country;
		
		this.address = ad;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
