package com.basic.practice;

public class UnaryOperators {

	public static void main(String[] args) {
		int a=10;
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		int x=20;
		int y=20;
		
		System.out.println(x++ + ++x);
		
		System.out.println(y++ + y++);
	}

}
