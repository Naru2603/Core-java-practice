package com.exception.customexception;

public class Citizen {

	String name;
	int voterId;
	String country;
	String age;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(String name, int voterId, String country, String age) {
		super();
		this.name = name;
		this.voterId = voterId;
		this.country = country;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", voterId=" + voterId + ", country=" + country + ", age=" + age + "]";
	}
	
	
}
