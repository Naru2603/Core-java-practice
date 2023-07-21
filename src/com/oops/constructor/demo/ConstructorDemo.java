package com.oops.constructor.demo;

public class ConstructorDemo {

	String accname;
	int accNo;
	int balance;
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		ConstructorDemo c = new ConstructorDemo("Narendra", 54125, 10000);
		c.deposite(13000);
		c.withdraw(4000);
		c.showBalance();
		
		System.out.println("Main method ended");
	}

	public ConstructorDemo(String accName, int accNo, int balance) {
		this.accname = accName;
		this.accNo = accNo;
		this.balance = balance;
		
		System.out.println(" Acc name is :"+accname);
		System.out.println(" Acc number is : "+accNo);
		System.out.println(" Balance is : " + balance);
	}
	
	public void deposite(int d) {
		balance = balance + d;
		System.out.println("Balance after deposite is : "+balance);
		
	}
	public void withdraw(int w) {
		if (w > balance) {
			System.out.println("Insufficient balance in account");
		}
		else {
			balance = balance - w;
			System.out.println("Balance after withdraw is :" + balance);
		}
	}
	
	public void showBalance() {
		System.out.println("Balance is : "+ balance);
	}
}
