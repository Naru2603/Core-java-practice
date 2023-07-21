package com.oops.overriding;

public class OverridingDemo2 {

	public int roi() {
		return 0;
	}
	
	public static void main(String [] args) {
		
		Axis a = new Axis();
		System.out.println("rate of interest of Axis is : "+a.roi());
		
		Icici i = new Icici();
		System.out.println("Rate of interest of ICICI is : "+i.roi());
	}
}
class Axis extends OverridingDemo2 {
	
	public int roi() {
		return 9;
	}
}
class Icici extends OverridingDemo2{
	
	public int roi() {
		return 10;
	}
}
class SBI extends OverridingDemo2{
	
	public int roi() {
		return 11;
	}
}
class BOI extends OverridingDemo2{
	
	public int roi() {
		return 12;
	}
}