package com.basic.loops2;

public class BreakDemo {

	public static void main(String[] args) {
		
		System.out.println("<<<for Break>>>>>>>");

		for (int i=1;i<=10;i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("<<<<<<<< While break?>>>>>>>>>>");
		
		int i=1;
		while (i<6) {
			if(i==4) 
				break;
				System.out.println(i);
				i++;
			
		}
	
	}

}
