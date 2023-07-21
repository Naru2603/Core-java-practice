package com.cloning.shallow;

public class Student implements Cloneable{

	int id;
	String name;
	Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String [] args) throws CloneNotSupportedException {
		
		Address ad = new Address(416203, "Hupari","India");
		Student s1 = new Student(12, "Narendra", ad);
		
		System.out.println(s1);
		
		Student s2 = (Student) s1.clone();
		
		System.out.println(s2);
	}
	
}
