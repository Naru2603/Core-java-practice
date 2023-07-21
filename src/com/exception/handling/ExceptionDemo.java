package com.exception.handling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method Started..!!");
		
		int res = 0;
		int denom = 2;
		int [] num = {10,20,30,40};
		
		try {
			res = num[7]/denom;
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException Occured");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Can not be devided by zero");
		}
		
		System.out.println("result is :"+ res);
		System.out.println("Main Method Ended");
	}

}
