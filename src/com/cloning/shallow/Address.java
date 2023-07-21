package com.cloning.shallow;

public class Address {

	int pin;
	String city;
	String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
