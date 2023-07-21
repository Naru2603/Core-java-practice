package com.basic.loops;

public class ElseIfDemo {

	public static void main(String[] args) {
		System.out.println("Grade is :"+isGradeResolver(79));

	}

	private static String isGradeResolver(int marks) {
		
		if(marks<40) {
			return "Student is fail";
		}
		else if(marks>50 && marks<65) {
			return "Grade C";
		}
		else if(marks>=65 && marks<75) {
			return "Grade B";
		}
		else if(marks >=75 && marks <=100) {
			return "First class with Distinction";
		}
		else 
		{
			return "Invalid marks";
		}
		

	}

}
