package com.basic.loops;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First no");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second NO");
		int n2=sc.nextInt();
		
		System.out.println("Select the case (+,-,/,*)");
		String ch=sc.next();
		
		int res;
		
		switch(ch){
			
			case "+": res=n1+n2;
					System.out.println("Addition is :"+res);
					break;
					
			case "-": res=n1-n2;
			System.out.println("Substraction is :"+res);
			break;
			
			case "*": res=n1*n2;
			System.out.println("Multiplication is :"+res);
			break;
			
			case "/": res=n1/n2;
			System.out.println("Devision is :"+res);
			break;
			
			default: System.out.println("Invalid Case");
			break;
		}
		

	}

}
