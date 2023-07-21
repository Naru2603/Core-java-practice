package com.exception.handling;

public class NestedTryDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		int i = 10;
		int res = 0;
		
		try {
			System.out.println("Inside outer try");
			
			res = 10/0;
			
			try {
				System.out.println("Inside Inner tyr");
			}
			catch(Exception E) {
				System.out.println("Inside Inner Catch");
		}
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException  Occured");
		}
		finally {
			System.out.println("Finally Block is always executed");
		}
	}

}
