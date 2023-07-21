package com.oops.Interface;

public interface InterfaceDefault {

	void display();
	default void add() {
		System.out.println("Inside default add method of interface");
	}
}
class Sum implements InterfaceDefault{
	
	public void display() {
		System.out.println("Inside display method of class ");
	}
}