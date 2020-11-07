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
		private String accountName;
		//private int accountID = 0;
		private int balance;
		static final AtomicLong NEXT_ID = new AtomicLong(0);
		final long id = NEXT_ID.getAndIncrement();
		boolean accountOn;
		
		public Customer() {
			super();
			Roster.customerList.add(this);//because we are referring to the objects that is being created at that time
			//if we didn't write the array list there is a possibility that we could lose the info
			CustomerFile.writeCustomerFile(Roster.customerList);
			//it will save to the array list and write to a file in the constructor.
		}
		public Customer(String accountName) {
			this.accountName= accountName;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "The account name has been updated, "+ this.getId() );
		}
		public Customer(String nameForAccount, int balance) {
			this.accountName= nameForAccount;
			this.balance = balance;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "A new account has been created, "+ this.getId() );
	
		}
		public Customer(boolean accountOn) {
			this.accountOn = accountOn;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "Account is turned on." );
		}
		public Customer(String username, String password) {
			this.username = username;
			this.password = password;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "A new account has been created, "+ this.getId() );
		}
		
		public long getId() {
	         return id;
	    }
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public boolean getAccountOn() {
			return accountOn;
		}
		public void setAccountOn(boolean accountOn) {
			this.accountOn = accountOn;
		}
		@Override
		public String toString() {
			return "Customer [accountName=" + accountName + ", balance=" + balance + ", id=" + id + ", accountOn="
					+ accountOn + "]";
		}

		
		
}
