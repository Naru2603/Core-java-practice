package com.oops.Interface;

public interface Showable {

	void show();
}
 interface Printable1{
	 
	void print();
}
class Test implements Showable,Printable{
	
	@Override
	public void show() {
		System.out.println("Im inside Showable interface");
	}
	
	@Override
	public void print() {
		System.out.println("Im inside printable interface");
	}
}