package com.exception.multicatch;

public class MultiCatchDemo {

	public static void main(String[] args) {
		
		int [] i = {45,20,55,36,84};
		int res = 0;
		
		try {
			res = i[5]/5;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println("Exception Occured");
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
