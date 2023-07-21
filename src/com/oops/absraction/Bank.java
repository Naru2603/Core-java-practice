package com.oops.absraction;

public abstract class Bank {

	public abstract int roi();
}

class Axis extends Bank {
	public int roi() {
		return 9;
	}
}
class SBI extends Bank{
	public int roi() {
		return 8;
	}
}
class PNB extends Bank{
	public int roi() {
		return 11;
	}
}