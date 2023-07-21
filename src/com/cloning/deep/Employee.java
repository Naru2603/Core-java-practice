package com.cloning.deep;

public class Employee implements Cloneable{

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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public  Object clone() throws CloneNotSupportedException {
		
		Employee clonedEmp = (Employee) super.clone();
		clonedEmp.address = (Address) address.clone();
		
		return clonedEmp;
	}
	
	
}
