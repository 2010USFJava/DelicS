package com.revature.beans;

import com.revature.fileslogging.CustomerFile;
import com.revature.fileslogging.Roster;
import com.revature.users.Customer;

public class Pokemon {

	private int iD;
	private String name;
	
	public Pokemon(){
		super();
	}

	public Pokemon(int iD, String name) {
		super();
		this.iD = iD;
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pokemon [iD=" + iD + ", name=" + name + "]";
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


