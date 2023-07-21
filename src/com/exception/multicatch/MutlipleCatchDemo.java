package com.exception.multicatch;

public class MutlipleCatchDemo {

	public static void main(String[] args) {
		int [] num = {78,41,5,26,5,44,1};
		int res = -0;
		
		try {
			res = num[7]/9;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Occured");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds Exception");
		}
		catch (Exception e) {
			System.out.println("Exception Occurred");
		}

	}

}
