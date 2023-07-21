package com.oops.overloading;

public class VarargsOverloading {

	public void show(int a) {
		System.out.println("Inside int method");
	}
	
	public void show(int... a) {
		System.out.println("Inside var args method");
	}
	public static void main(String[] args) {
		VarargsOverloading v = new VarargsOverloading();
		v.show(50);
		v.show(10,20,30);
	}

}
