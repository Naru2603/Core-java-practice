package com.basic.practice;

import java.util.Scanner;

public class ScannerDemo {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println("Enter gender");
		char c=sc.next().charAt(0);
		
		System.out.println("Enter mobile nu");
		long no=sc.nextLong();

		
		System.out.println("Name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("gender is: "+c);
		System.out.println("number is: "+no);
	}

}
