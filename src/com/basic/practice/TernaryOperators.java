package com.basic.practice;

public class TernaryOperators {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		int min=(x<y)?x:y;
		
		String res=(x>y)?"x is greater":"y is greater";
		
		System.out.println(res);
		
		System.out.println(min);
	}

}
