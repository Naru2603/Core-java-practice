package com.oops.Interface;

public interface Printable {

	void print();
}
class Print implements Printable{
	
	public void print() {
		System.out.println("Hello World");
	}
}