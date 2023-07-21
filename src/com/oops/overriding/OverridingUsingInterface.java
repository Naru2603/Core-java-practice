package com.oops.overriding;

public interface OverridingUsingInterface {
	
	void m1();
	
	void m2();

}
class TestDemo implements OverridingUsingInterface{
	
	public void m1() {
		System.out.println("Overriden m1 method from interface");
	}
	
	public void m2() {
		System.out.println("Overidden m2 method from interface");
	}
	
	public void m3() {
		System.out.println("Inside m3 method");
	}
}
