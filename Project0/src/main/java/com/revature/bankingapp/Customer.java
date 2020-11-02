package com.revature.bankingapp;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2065636986131477964L;
	//Scanner scanner = new Scanner(System.in);
	//Whenever we create a new customer object, writ it to an array list
	private String username;
	private String password;
	private int accountNumber;
	private int startingBalance;
	
	public Customer() {
		super();
		CustomerList.customerList.add(this);//because we are referring to the objects that is being created at that time
		//if we didn't write the array list there is a possibility that we could lose the info
		CustomerFileIO.writeCustomerFile(CustomerList.customerList);
		//it will save to the arraylist and write to a file in the constructor.
	}
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public Customer(int accountNumber, int startingBalance) {
		this.accountNumber = accountNumber;
		this.startingBalance = startingBalance;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getStartingBalance() {
		return startingBalance;
	}
	public void setStartingBalance(int startingBalance) {
		this.startingBalance = startingBalance;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", accountNumber=" + accountNumber
				+ ", startingBalance=" + startingBalance + "]";
	}
}
