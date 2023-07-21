package com.string.immutableclass;

public class Student {

	private final int roll;  //#2: declare all fields private and final
	private final String name;
	private final Address address;
	
	public Student() {
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		
		Address clonedAddress = new Address(); //#4:perform deep copy for mutable field in constructor
		clonedAddress.setCity(address.getCity());
		clonedAddress.setCountry(address.getCountry());;
		clonedAddress.setPin(address.getPin());
		
//		this.address = address;
		
		this.address = clonedAddress;
	}

	public int getRoll() {
		return roll;
	}

//	public void setRoll(int roll)  //#3:remove setter methods
//	{ 
//		this.roll = roll;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Address getAddress() {
		
//		return address; // #5:instead of returning original address(mutable field), return a copy of address
		Address dummyAddress = new Address();
		dummyAddress.setCity(this.address.getCity());
		dummyAddress.setCountry(this.address.getCountry());
		dummyAddress.setPin(this.address.getPin());
		return dummyAddress;
	}


//	public void setAddress(String address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
}
