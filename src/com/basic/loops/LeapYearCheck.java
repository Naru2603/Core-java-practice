package com.basic.loops;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		if(isLeapYear(2020)) {
			System.out.println("leap Year");
		}
		else {
			System.out.println("Not Leap year");
		}
		
	}

	private static boolean isLeapYear(int i) {
		if((i % 4  ==0) && (i%100!= 0)||( i % 400 == 0)){
			return true;
		}
		else {
			return false;
		}
	}

}
