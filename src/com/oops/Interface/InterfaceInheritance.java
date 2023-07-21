package com.oops.Interface;

public interface InterfaceInheritance {

	void show();
}
interface Add extends InterfaceInheritance{
	
	void add();
}
class Devide implements Add{
	
	public void show() {
		System.out.println("Inside show method of Devide class");
	}
	
	public void add() {
		System.out.println("Inside add method of Devide class");
	}
}