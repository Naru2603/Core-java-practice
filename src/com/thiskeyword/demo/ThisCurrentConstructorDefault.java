package com.thiskeyword.demo;

public class ThisCurrentConstructorDefault {

	public ThisCurrentConstructorDefault() {
		
	}
	
	public ThisCurrentConstructorDefault(int x) {
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		ThisCurrentConstructorDefault n =new ThisCurrentConstructorDefault(10);
	}

}
