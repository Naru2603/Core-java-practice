package com.thiskeyword.demo;

public class ThisConstructorCallDemo {

	int rollno;
	String name, course;
	float fees;
	
	public ThisConstructorCallDemo (int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	public ThisConstructorCallDemo (int rollNo, String name, String course, float fees){
		this(rollNo,name,course);
		this.fees = fees;
	} 	
	
	 public void show() {
		 System.out.println(rollno+" "+name+" "+course+" "+fees);
	 }
	public static void main(String[] args) {
		
		ThisConstructorCallDemo t =new ThisConstructorCallDemo(124, "Narendra", " Front end ");

		ThisConstructorCallDemo t1= new ThisConstructorCallDemo(521,"Mayur", "Java Full stack", 45220);
		
		t.show();
		t1.show();
	}

}
