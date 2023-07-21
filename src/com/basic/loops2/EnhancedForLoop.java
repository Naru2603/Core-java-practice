package com.basic.loops2;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int [] number= {12,2,3,5,3,42,13,23};
		
		for(int n :number) {
			System.out.println(n);
		}

		System.out.println("=======================");
		
		String [] s1= {"hi","Hello","Narendra","Welcome","To","Pune"};
		
		for(int i=0;i<s1.length-1;i++) {
			System.out.println(s1[i]);
			
		}
		
		System.out.println("<<<<<<<<< For Each Loop >>>>>>>>>>>>>>");
		
		for(String s2: s1) {
			System.out.println(s2);
		}
	}

}
