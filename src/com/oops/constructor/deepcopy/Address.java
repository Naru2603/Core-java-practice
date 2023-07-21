package com.oops.constructor.deepcopy;

public class Address {

	int pin;
	String city;
	String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String name, String country) {
		super();
		this.pin = pin;
		this.city = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", name=" + city + ", country=" + country + "]";
	}
	
	
}
