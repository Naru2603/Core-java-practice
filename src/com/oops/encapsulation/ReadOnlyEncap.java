package com.oops.encapsulation;

public class ReadOnlyEncap {

	private String name;
	private int id;
	
	public ReadOnlyEncap(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
