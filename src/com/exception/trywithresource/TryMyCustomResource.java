package com.exception.trywithresource;

public class TryMyCustomResource {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		try (MyCustomResource mr = new MyCustomResource()){
			System.out.println("Inside try method ");
			mr.doSomething();
			System.out.println("Try ended");
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Eception ocuured");
		}
		catch (Exception e) {
			System.out.println("Exception Occuered");
		}
		System.out.println("Main Method Ended");
	}

}
