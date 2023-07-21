package com.basic.loops2;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		int a[]= {22,21,31,12,14,5,6,7,54,65};
		
		for (int i=0;i<=6;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		
		for (int j:a) {   // for each loop
			System.out.println(j);
		}
	}

}
