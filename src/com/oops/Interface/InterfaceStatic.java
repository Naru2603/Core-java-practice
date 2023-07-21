package com.oops.Interface;

public interface InterfaceStatic {

	void display();
	static double area (int r) {
		return 3.14*r*r;
	}
}
class TestStatic implements InterfaceStatic{
	
	@Override
	public void display() {
		System.out.println("Inside display method of Area class");
	}
}