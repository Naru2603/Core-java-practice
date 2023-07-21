package com.oops.inheritance.association;

public class TestAggregationCompostion {

	public static void main(String[] args) {
		
		StudentId id = new StudentId(24, 8421681779L);
		Student std= new Student("Badya", 52, 59.5f);
		
		
		Student2 s2 = new Student2("ADCET", 75.5f, id);
		System.out.println(s2);
	}

}
