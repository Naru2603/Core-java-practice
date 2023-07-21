package com.exception.handling;

public class NestedTryDemo2 {

	public static void main(String[] args) {
		
		try {
			int [] num = {10,20,62,58,45};
			System.out.println("Inside outer Try");
			
			int res = num[5];
			
			try {
				int i = num[2]/2;
				System.out.println("Inside inner try");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" ArrayIndexOutOfBoundsException ocuured");
				System.out.println(" Invalid number");
			}
			finally {
				System.out.println("Inside inner finnaly");
			}
		}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" ArrayIndexOutOfBoundsException ocuured");
				System.out.println(" Invalid number");
			}
			finally{
				System.out.println("Finnaly block is always executed");
			}
		}

	}

