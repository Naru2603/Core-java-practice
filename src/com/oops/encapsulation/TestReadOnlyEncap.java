package com.oops.encapsulation;

public class TestReadOnlyEncap {

	public static void main(String[] args) {
		
		ReadOnlyEncap readEncap = new ReadOnlyEncap("Narendra", 4126);
		
		System.out.println("Employee name is : "+readEncap.getName());
		System.out.println("Employee Id is : "+readEncap.getId());

	}

}
