package com.string.practical;

public class StringComparison2 {

	public static void main(String[] args) {
		
		String s1 = new String ("you cannot change me "); // two objects will be created 1 in heap and 1 in scp
		String s2 = new String ("you cannot change me "); // only one object is created in heap
		
		System.out.println(s1 == s2); 
		System.out.println("==============================");
		
		String s3 = "you cannot change me"; // no object will be created as it is already present in scp
		System.out.println(s1 == s3); 
		System.out.println("==============================");
		
		String s4 = "you cannot change me"; //no object will be created as it is already present in scp
		
		System.out.println(s3 == s4);
		System.out.println("==============================");
		
		String s5 = "you cannot" + "change me"; //no object will be created as it is already present in scp
		System.out.println(s4 == s5);
		System.out.println("==============================");
		
		String s6 = "you cannot"; //one object will be created in scp, s6 will be pointing to scp object
		String s7 = s6 + "change me"; // two objects will be created 1 in heap and 1 in scp and s7 will be pointing to heap object
		System.out.println(s4 == s7);
		System.out.println("==============================");
		
		final String s8 = "you cannot";
		String s9 = s8 + "change me";  //only one object will be created as final is constant 
		System.out.println(s4 == s9); 

	}

}
