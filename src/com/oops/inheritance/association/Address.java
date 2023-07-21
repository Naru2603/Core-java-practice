package com.oops.inheritance.association;

public class Address {

	String city;
	String state;
	String country;
	int pinCode;
	
	public Address (String city, String state, String country, int pinCode) {
		this.city = city;
		this.country = country;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
}
