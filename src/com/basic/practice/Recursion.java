package com.basic.practice;

public class Recursion {

	public static int Factorial(int n) {
		
		if(n != 0) {
			return n*Factorial(n-1);
		}
		else 
			return 1;
	}
	public static void main(String[] args) {
		
		Recursion rec = new Recursion();
		System.out.println("Factorial is : "+rec.Factorial(6));
		
	}

}
