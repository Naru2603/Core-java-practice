package com.oops.overloading;

public class OverloadingDemo3 {

	public void m1(int i, int j) {
		System.out.println("Inside m1(int i, int j)");
	}
	
	public void m1(long i, int j) {
		System.out.println("Inside m1(long, int)");
		
	}
	
	public void m1(Integer I, long J) {
		System.out.println("inside m1(Integer, Long");
	}
	
	public static void main(String[] args) {
		int a = 20, b =30;
		long x=25l, y =40l;
		
		OverloadingDemo3 o = new OverloadingDemo3();
		o.m1(20, 40);
	}

}
