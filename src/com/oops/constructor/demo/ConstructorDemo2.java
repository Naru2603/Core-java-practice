package com.oops.constructor.demo;

public class ConstructorDemo2 {

	String accname;
	int accNo;
	int balance;
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		ConstructorDemo2 c = new ConstructorDemo2();
		c.deposite(13000);
		c.withdraw(4000);
		c.showBalance();
		
		System.out.println("Main method ended");
	}

	public ConstructorDemo2() {
		this.accname = "Narendra";
		this.accNo = 1245;
		this.balance = 5000;
		
		System.out.println(" Acc name is :"+accname);
		System.out.println(" Acc number is : "+accNo);
		System.out.println("Balance is : " + balance);
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
		System.out.println("Overall Balance is : "+ balance);
	}
	
}
