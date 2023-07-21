package com.exception.deligation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Maint method started");
		m1();
		System.out.println("Main method ended");

	}

	private static void m1() {
		System.out.println("M1 method started");
		try {
		m2();
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not found exception ");
		}
		catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 method ended ");
	}
	

	private static void m2() throws FileNotFoundException, IOException, Exception {
		System.out.println("M2 method started");
		m3();
		System.out.println("m2 method ended ");
	}

	private static void m3() throws FileNotFoundException, IOException, Exception {
		System.out.println("M3 method started");
		m4();
		System.out.println("m3 method ended ");
	}
	private static void m4() throws Exception,IOException, FileNotFoundException {
		System.out.println("M4 method started");
		
		FileReader fr = new FileReader("a.txt");
		fr.read();
		
		System.out.println("m4 method ended ");
	}
}
