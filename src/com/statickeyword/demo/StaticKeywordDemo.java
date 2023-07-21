package com.statickeyword.demo;

public class StaticKeywordDemo {

	int rollNo;
	String name;
	static String clgName = "ADCET";
	
	public StaticKeywordDemo(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	 public void diplay() {
		 System.out.println("Roll no is :"+rollNo);
		 System.out.println("Student name is :"+name);
		 System.out.println("College name is :"+clgName);
		 
		 System.out.println("=========================");
	 }
	public static void main(String[] args) {
		
		StaticKeywordDemo sd =new StaticKeywordDemo(12, "Rahul Badiger");
		
		StaticKeywordDemo sd1 = new StaticKeywordDemo(10, "Mayur Pore ");
		
		sd.diplay();
		sd1.diplay();
	}

}
