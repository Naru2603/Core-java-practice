package com.oops.overloading;

public class TypePromotionOverloading {
	
	public void sum(int a, long b) {
		System.out.println(a+b);
		System.out.println("Inside first sum method");
	}

	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println("Inside second sum method");
	}
	public static void main(String[] args) {
		
		TypePromotionOverloading t = new TypePromotionOverloading();
		t.sum(10, 20);
		t.sum(20, 30, 40);
		
	}

}
