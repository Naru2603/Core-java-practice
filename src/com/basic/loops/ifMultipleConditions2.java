package com.basic.loops;

public class ifMultipleConditions2 {

	public static void main(String[] args) {
		int a=10;
		int b=50;
		int c=20;
		
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is greater");
			}
			else {
				System.out.println("C is greater");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("B is greater");
			}
			else {
				System.out.println("C is greater");
			}
		}
		
	}

}
