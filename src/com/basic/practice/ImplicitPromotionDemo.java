package com.basic.practice;

public class ImplicitPromotionDemo {

	public static void main(String[] args) {
		
		byte a=127;
		
		short b=(short)a; //implicitly converted byte into short
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		short s1=23;
		
		byte s2=(byte)s1; //explicitly converted short to byte
		
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int x=20;
		long y=x;
		
		long x1=7885456665L;
		int y1=(int)x1;
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("x1= "+x1);
		System.out.println("y1= "+y1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		float z=51.5f;
		double z1=z;
		
		double t1=65;
		float t=(float)t1;
		
		System.out.println("z= "+z);
		System.out.println("z1= "+z1);
		System.out.println("t1= "+t1);
		System.out.println("t= "+t);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int i=23;
		char j=(char)i;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		char j1='c';
		byte o=(byte)j1;
		
		System.out.println("c = "+o);
		
		

	}

}
