package com.revature.bank;

import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3718081231509928326L;
		private String accountName;
		private UUID accountID;
		private int balance;
		
		public Customer() {
			super();
			Roster.customerList.add(this);//because we are referring to the objects that is being created at that time
			//if we didn't write the array list there is a possibility that we could lose the info
			CustomerFile.writeCustomerFile(Roster.customerList);
			//it will save to the array list and write to a file in the constructor.
		}
		public Customer(String nameForAccount, UUID accountID, int balance) {
			this.accountName= nameForAccount;
			this.accountID = accountID;
			this.balance = balance;
			Roster.customerList.add(this);
			CustomerFile.writeCustomerFile(Roster.customerList);
			LogThis.LogIt("info", "A new account has been created, "+ this.accountID );
	
		}

		public UUID getAccountID() {
			return accountID;
		}
		public void setAccountID(UUID accountID) {
			this.accountID = UUID.randomUUID();
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
		@Override
		public String toString() {
			return "Customer [accountName=" + accountName + ", accountID=" + accountID + ", balance=" + balance + "]";
		}
		
}
