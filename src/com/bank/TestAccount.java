package com.bank;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account();
		acc1.insertData(15627922, "amit", 4000);
		acc1.display();
		acc1.deposit(5000);
		acc1.checkBalance();
		acc1.withdraw(2000);
		acc1.checkBalance();
		acc1.display();

	}

}
