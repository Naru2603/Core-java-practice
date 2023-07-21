package com.oops.Interface;

public interface Bank {

	int roi();
}
class Axis implements Bank{
	
	public int roi() {
		return 11;
	}
}
class SBI implements Bank{
	
	public int roi() {
		return 9;
	}
}
class BOI implements Bank{
	
	public int roi() {
		return 10;
	}
}
class ICICI implements Bank{

	public int roi() {
	return 8;
}
}