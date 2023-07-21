package com.thiskeyword.demo;

public class ThisCurrentConstructorParam {

	public ThisCurrentConstructorParam() {
		this(5);
	}
	public ThisCurrentConstructorParam(int x) {
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {

		ThisCurrentConstructorParam a =new ThisCurrentConstructorParam();
		
	}

}
