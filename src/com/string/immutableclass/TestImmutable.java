package com.string.immutableclass;

public class TestImmutable {

	public static void main(String[] args) {
	
			
			Address ad1 = new Address("Pune", "India", 1234);
			
			Student s1 = new Student(10, "Ram", ad1);
			
			System.out.println("Student object before change : "+s1);
			
//			s1.setRoll(20);
//			s1.setName("Sham");
//			s1.setAddress("Mumbai");
			
//			s1.roll = 30;
			
//			StudentChild s2 = new StudentChild(20,"abc","pqr");
//			
//			s2.changeStudent();
//			
//			System.out.println(s2);

			
			ad1.setCity("Dubai"); 
			
			s1.getAddress().setCity("Mumbai");
			
			
			System.out.println("Student object after change : "+s1);
		}


	}

