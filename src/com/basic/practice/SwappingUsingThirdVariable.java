package com.basic.practice;

public class SwappingUsingThirdVariable {

	public static void main(String [] args){
		
		int a = 10;
		int b = 20;
		int t= 0;
		
		t= a; //10
		a = b; //20
		b = t; //10 
		
		System.out.println(a);
		System.out.println(b);
	}
}
