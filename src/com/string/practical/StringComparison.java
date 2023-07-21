package com.string.practical;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = new String ("Narendra");
		
		String s2 = new String ("Narendra");
		
		String s6 = s1.intern();
	
		
		System.out.println(s1 == s2);  // return false as it is used to compare reference or address
		
		System.out.println("================");
		
		String s3 = "Rishi";

		String s4 = "Rishi";
		
		System.out.println(s4 == s3);  // true bcz both are referring to same object
		
		System.out.println("====================");
		
		System.out.println("Equals method : "+s1.equals(s2));
		
		String s5 = "Narendra";
		
		System.out.println("=================");
		
		System.out.println(s3.equals(s5));
		
		System.out.println("=================");
		
		System.out.println(s1.equals(s5));
		
		System.out.println("=================");
		System.out.println(s1 == s6);
		
		System.out.println("=================");
		System.out.println(s5 == s6);
		
	}

}
