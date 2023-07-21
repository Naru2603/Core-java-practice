package com.oops.encapsulation;

public class TestEncapsulationDemo {

	public static void main(String[] args) {
		
		EncapsulationDemo encap = new EncapsulationDemo();
		
		encap.setName("Narendra");
		System.out.println(encap.getName());
		
		encap.setAge(25);
		System.out.println(encap.getAge());
		
		encap.setNumber(84215);
		System.out.println(encap.getAge());

		System.out.println(encap);
	}

}
