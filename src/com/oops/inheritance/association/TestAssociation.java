package com.oops.inheritance.association;

public class TestAssociation {

public static void main (String [] args) {
		
		Address a = new Address("Hupari","Maharashtra","India",416203);
		
		Person p = new Person("Narendra Korade", 1245, a);
		System.out.println(p);
		
	}
}
