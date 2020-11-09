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
		public static void depositTest() {
			Customer b = new Customer();
			Account a = new Account();
			double amount = 20;
			int expected = Account.deposit(amount, b);
			assertEquals()
		}
	}