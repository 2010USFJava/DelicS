package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.revature.mainthings.Account;
import com.revature.users.Customer;

public class AccountTest {
		@BeforeClass
		public static void initialSetUp(){
			System.out.println("Testing");
		}
		@Before
		public void runBeforeEachTest() {
			System.out.println("Running before each test.");
		}
		@Test
		public void loadCustomerInfo() {
			//Account account = new Account();
			Customer a = new Customer("a", "a", "a", "a", true, 0, 0);
			System.out.println("loaded customer...");
			System.out.println(a.toString());
		}
		public void depositTest() {
			int amount = 20;
			Customer a = new Customer();
			Account.deposit(amount, a);
			int modBalance = (int) (a.getBalance() + amount);
			assertEquals(modBalance, (int) a.getBalance());
		}
		public void withdrawTest() {
			int amount = 20;
			Customer a = new Customer();
			Account.withdraw(amount, a);
			int modBalance = (int) (a.getBalance() - amount);
			assertEquals(modBalance, (int) a.getBalance());
		}
		public void transferTest() {
			Customer a = new Customer();
			Customer b = new Customer();
			int amount = 20;
			Account.transfer(amount, a, b);
			int modBalance = (int) (a.getBalance() - amount);
			int modBalance2 = (int) (b.getBalance() + amount);
			assertEquals(modBalance, (int) a.getBalance());
			assertEquals(modBalance2, (int) b.getBalance());
		}
	}