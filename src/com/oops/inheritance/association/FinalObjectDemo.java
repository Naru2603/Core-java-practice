package com.oops.inheritance.association;

public class FinalObjectDemo {

	public static void main(String[] args) {
		
		final StudentPOJO st = new StudentPOJO("Mayur", 123, 89);
		
		System.out.println("Before changing values : "+st);
		
		st.setName("Bashya");
		st.setMarks(65);
		st.setRollNO(302);
		
		System.out.println("After changing values : "+st);

	}

}
