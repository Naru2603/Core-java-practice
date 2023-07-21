package com.basic.practice;

public class FinalNonAccessModifierDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.adhaar = 1234;
		p1.name = "Ram";
		
		System.out.println("Before changing values : ");
		System.out.println(p1.adhaar);
		System.out.println(p1.name);
		System.out.println(p1.country);
		
		p1.adhaar = 6789;
		p1.name = "Sham";

		System.out.println("After changing values : ");
		System.out.println(p1.adhaar);
		System.out.println(p1.name);
		System.out.println(p1.country);

		
		Person p2 = new Person();
		p2.adhaar = 3456;
		p2.name = "John";
		
//		p1 = p2;
		
		System.out.println("After changing reference : ");
		System.out.println(p1.adhaar);
		System.out.println(p1.name);
		System.out.println(p1.country);

		
		Integer j = 40;
		j = 50;
		
	}

}
