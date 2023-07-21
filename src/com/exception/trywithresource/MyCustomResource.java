package com.exception.trywithresource;

public class MyCustomResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("My Resourse closed successfuly");
	}
	
	public void doSomething() {
		int res = 10/0;
	}

	
}
