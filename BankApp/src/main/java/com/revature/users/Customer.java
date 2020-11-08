package com.revature.users;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import com.revature.fileslogging.*;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3718081231509928326L;
		private String username;
		private String password;
		private String username2;
		private String password2;
		private int accountNumber;
		private double balance;
		//static final AtomicLong NEXT_ID = new AtomicLong(0);
		//final long id = NEXT_ID.getAndIncrement();
		boolean accountOn;
		
		public Customer() {
			super();
			//Roster.customerList.add(this);//because we are referring to the objects that is being created at that time
			//if we didn't write the array list there is a possibility that we could lose the info
			//CustomerFile.writeCustomerFile(Roster.customerList);
			//it will save to the array list and write to a file in the constructor.
		}
		public Customer(String username, String password, String username2, String password2, boolean accountOn, int accountNumber, double balance) {
			this.username = username;
			this.password = password;
			this.username2 = username2;
			this.password2 = password2;
			this.accountOn = accountOn;
			this.accountNumber = accountNumber;
			this.balance = balance;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "A new account has been created, "+ this.getAccountNumber() );
			
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
		/*public long getId() { 
	         return id;
	    }*/
		public double getBalance() {
			return balance;
		}
		public void setBalance(double acc2) {
			this.balance = acc2;
		}
		public String getUsername2() {
			return username2;
		}
		public void setUsername2(String username2) {
			this.username2 = username2;
		}
		public String getPassword2() {
			return password2;
		}
		public void setPassword2(String password2) {
			this.password2 = password2;
		}
		public boolean getAccountOn() {
			return accountOn;
		}
		public void setAccountOn(boolean accountOn) {
			this.accountOn = accountOn;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		@Override
		public String toString() {
			return "Customer [username=" + username + ", password=" + password + ", username2=" + username2
					+ ", password2=" + password2 + ", accountNumber=" + accountNumber + ", balance=" + balance
					+ ", accountOn=" + accountOn + "]";
		}
		
}
