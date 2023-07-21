package com.oops.inheritance.Multilevel;

public class Person {

	private String name;
	private String city;
	
	public void setData(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public void showData() {
		System.out.println("Name is : "+name);
		System.out.println("City is : "+city);
	}
}
class Employee extends Person{
	private int empId;
	private String job;
	private int salary;
	
	public void setData(String name, String city, int empId, String job, int salary) {
		super.setData(name, city);
		this.empId = empId;
		this.job = job;
		this.salary = salary;
	}
	
	public void showData() {
		super.showData();
		System.out.println("Employee id is : "+empId);
		System.out.println("Job designation is : "+job);
		System.out.println("Salary is : "+salary);
	}
}
class Manager extends Employee {
	private int dptNo;
	private String dptName;
	
	public void setData(String name, String city, int empId, String job, int salary,int dptNo, String dptName) {
		super.setData(name, city, empId, job, salary);
		this.dptName = dptName;
		this.dptNo = dptNo;
	}
	
	public void showData() {
		super.showData();
		System.out.println("Department number is : "+dptNo);
		System.out.println("Departmane name is : "+dptName);
	}
}