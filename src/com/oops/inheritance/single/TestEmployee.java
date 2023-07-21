package com.oops.inheritance.single;

public class TestEmployee extends Employee{

	private String cName;
	private int bonus;
	
	public void show(String cName, int bonus) {
		this.bonus =  bonus;
		this.cName = cName;
		
		System.out.println("Company is : "+cName);
		System.out.println("Bonus is : "+bonus);
	}
	public static void main(String[] args) {
		
		TestEmployee t = new TestEmployee();
		t.display("Narendra", 1203, 80000);
		
		t.show("Infosys", 15000);
	}

}
