package com.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		methodUsingTrywithResource();
		methodUsingTrywithoutResource();
		readFirslLineFromFile("a.txt");
		System.out.println("Main method ended");

	}

	private static void methodUsingTrywithoutResource() {
		Connection con = null;
		try{
			con = DriverManager.getConnection("url");
			Statement stmt = con.createStatement();
		}
		catch(SQLException e) {
			System.out.println("SQL Exception occured ");
		}
		finally{
			try {
				con.close();
			}catch (SQLException e) {
				System.out.println("SQL exception occured during db connection");
			}
			finally {
				System.out.println("Inside finally");
			}
		}
		
	}

	private static void methodUsingTrywithResource() {
		 try (Connection con = DriverManager.getConnection("url")){
			 Statement stmt = con.createStatement();
		 }catch (SQLException e) {
			 System.out.println("SQL Exception is there");
		 }
		
	}
	public static String readFirslLineFromFile(String path) {
		String firstLine = null;
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)){
			firstLine = br.readLine();
			return firstLine;
		}catch (IOException e) {
			System.out.println("IO Exception Ouucred");
		}
		return firstLine;
		
	}
}

	