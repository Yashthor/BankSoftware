package com.bank;

public class Account {
	int acc_no;
	String name;
	float amount;
	
	// for inserting data 
	void insertData(int a,String n,float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	// for deposit
	void deposit(float amt) {
		amount = amount+amt;
		System.out.println("Amount inserted into account number " + acc_no + ": " + amt);			
	}
	
	// withdraw
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient balance");
		}
		else {
			amount = amount-amt;
			System.out.println("Amount withdraw from account number " + acc_no + ": " + amt);	
		}
	}
	
	// for balance check
	void checkBalance() {
		System.out.println("Current Amount in account number " + acc_no + " is: " + amount);
	}
	
	// for display
	void display() {
		System.out.println("your account number is " + acc_no + " and account holder name is " + name + " amount present " + amount);
	}
	
	

}
