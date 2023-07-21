package com.oops.inheritance.Multilevel;

public class TestShape {

	public static void main(String[] args) {
			Circle c = new Circle();
			c.area();
			c.display();
			c.volume();
			c.Perimeter();
			
			Rectangle r = new Rectangle();
			r.area();
			r.display();
			r.volume();
			System.out.println("=====================");
			
			Cube cb = new Cube();
			cb.display();
			cb.volume();
			System.out.println("=====================");
			
			
			
			
		}

	}

