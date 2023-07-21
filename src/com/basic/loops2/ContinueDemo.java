package com.basic.loops2;

public class ContinueDemo {

	public static void main(String[] args) {
		
		System.out.println(" <<<<<<<< For continue");
		
		for (int i=1;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println("< i: "+i);
		}

		System.out.println(" <<<<<<<< while continue");
		
		int i=1;
		while (i<10) {
			if(i==7) {
				i++;
				continue;
			}
			System.out.println("<<<< j: "+i);
			i++;

	}
	
}
}
