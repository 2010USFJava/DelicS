package com.revature.mainthings;

import com.revature.users.Customer;
import com.revature.fileslogging.*;

public class Account {	
	
	public static void deposit(double amount, Customer a) {
		double balance = a.getBalance();
		if(amount>= 1) {
			double modBalance = balance + amount;
			if (modBalance < 0) {
				System.out.println("Account can not be overdrawn.");
			}else {
				System.out.println("The current balance is $" + modBalance + ".");
				a.setBalance(modBalance);
				CustomerFile.writeCustomerFile(Roster.customerList);
			}
		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");		
		}

	}
	public static void withdraw(double amount, Customer a) {
		double balance = a.getBalance();
		if(amount>= 1) {
			double modBalance = balance - amount;
			if (modBalance < 0) {
				System.out.println("Account can not be overdrawn.");
			}else {
				System.out.println("The current balance is $" + modBalance + ".");
				a.setBalance(modBalance);
				CustomerFile.writeCustomerFile(Roster.customerList);
			}
		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");		
		}
	}
	public static void transfer(double amount, Customer a, Customer b) {
		//a is going to withdraw from b

		double firstBalance= a.getBalance();
		double secondBalance = b.getBalance();
		if (firstBalance == 0) {
			System.out.println("You need money to make a transfer...");
		}else{
			double modBalance = firstBalance - amount;
				if (modBalance < 0) {
					System.out.println("Account can not be below zero");
				}else {
					a.setBalance(modBalance);

					b.setBalance(secondBalance + amount);
					System.out.println("The current balance is $" + modBalance);
					CustomerFile.writeCustomerFile(Roster.customerList);
				}
		}
}
	public static void viewBalance(Customer a) {
		double balance = a.getBalance();
		System.out.println("The current balance is $" + balance);
	}
}
