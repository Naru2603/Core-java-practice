package com.oops.inheritance.association;

public class TestPojo {

	public static void main(String[] args) {
		
		StudentPOJO s = new StudentPOJO();
		s.setRollNO(20);
		System.out.println(s.getRollNO());
		s.setRollNO(60);
		System.out.println(s.getRollNO());
	}

}
