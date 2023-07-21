package com.oops.inheritance.Multilevel;

public class Shape {

	public void display() {
		System.out.println("Inside diplay method");
	}
}

class Cube extends Shape{
	
	public void volume() {
		System.out.println("Inside volume method ");
	}
}
class Rectangle extends Cube{
	public void area() {
		System.out.println("Inside display  method of rectangle");
	}
}
class Circle extends Rectangle{
	public void Perimeter() {
		System.out.println("Inside perimeter method");
		
		System.out.println("=================");
	}
	
}