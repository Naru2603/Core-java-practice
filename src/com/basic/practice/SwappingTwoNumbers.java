package com.basic.practice;

public class SwappingTwoNumbers {

	
	
	public static void main(String[] args) {
		int number = 20;
		int number2 = 30;
		
		
		System.out.println("Before swpping numbers are : "+number);
		System.out.println("Before swpping numbers are : "+number2);
		System.out.println("=========================================");
		
		number = number+number2; // 20+30= 50
		number2 = number-number2; // 50-30 = 20
		number = number-number2; //50-20= 30
		
		System.out.println(number);
		System.out.println(number2);
	}

}
