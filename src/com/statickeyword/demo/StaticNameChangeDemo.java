package com.statickeyword.demo;

public class StaticNameChangeDemo {
	
	int rollNo;
	String name;
	static String clgName = "Walchand";
	
	public static void change() {
		clgName = "ADCET";
	}
	
	public StaticNameChangeDemo(int rollNO, String name) {
		this.name = name;
		this.rollNo = rollNO;
	}
	
	public void display() {
		System.out.println(" Roll no is : "+rollNo);
		System.out.println(" Name is : "+name);
		System.out.println("College name is :"+clgName);
	}
	
	public static void main(String[] args) {
		StaticNameChangeDemo.change();
		
		StaticNameChangeDemo cd = new StaticNameChangeDemo(253, "Rishi Korade");
		cd.display();

	}

}
