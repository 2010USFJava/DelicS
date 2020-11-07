package com.revature.bankingapp;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2065636986131477964L;
	private String username;
	private String password;
	private int balance;
	
	public Customer() {
		super();
		Roster.customerList.add(this);//because we are referring to the objects that is being created at that time
		//if we didn't write the array list there is a possibility that we could lose the info
		CustomerFileIO.writeCustomerFile(Roster.customerList);
		//it will save to the arraylist and write to a file in the constructor.
	}
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
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
	
}
	
	
