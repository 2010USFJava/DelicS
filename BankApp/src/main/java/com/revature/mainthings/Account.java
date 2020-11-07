package com.revature.mainthings;

import com.revature.users.Customer;
import com.revature.fileslogging.*;

public class Account {
private static int balance;
	
	
	public static void deposit(int amount) {
		if(amount>= 1) {
			balance = balance + amount;
			
			System.out.println("Your current balance is $" + balance + ".");
			//accountModifications();

		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");
			//accountModifications();
		}
	}
	public static void withdraw(int amount) {
		if(amount>= 1) {
			balance = balance - amount;
			
			System.out.println("Your current balance is $" + balance + ".");
			//accountModifications();
		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");
			//accountModifications();
			}
	}
	public static void transfer(int amount, Customer a, Customer b) {
		//a is going to withdraw from b
		int acc1= (a.getBalance())- amount;
		int acc2 = (b.getBalance()) + amount;
		
		a.setBalance(acc1);
		b.setBalance(acc2);
		//(acc2-acc1);
		CustomerFile.writeCustomerFile(Roster.customerList);
		
		/*public class Fight {
			public void fightTime(Warrior a, Warrior b) {
				//a is going to hit b
				int firstAttackPower= a.getAttackPower();
				int secondHP = b.getHp();
				
				b.setHp(secondHP-firstAttackPower);
				FileStuff.writeWarriorFile(Roster.warriorList);
			}
		}
	}*/

}
	public void viewAccount(long accountView) {
		
	}
}
