package com.basic.loops;

public class EvenOddNumberCheck {

	public static void main(String[] args) {
		
		if(isEven(10023)) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}

	private static boolean isEven(int i) {
		if(i%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
