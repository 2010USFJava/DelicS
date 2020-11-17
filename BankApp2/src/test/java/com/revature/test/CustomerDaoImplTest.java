package com.revature.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.jdbc.beans.Customer;
import com.revature.jdbc.dao.CustomerDao;
import com.revature.jdbc.dao.CustomerDaoImpl;


public class CustomerDaoImplTest {
	@BeforeClass
	public static void initial() {
		System.out.println("I run once before everything");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("I run before each test");
	}
	@Test
	public void retrieveUserTest() throws SQLException {
		CustomerDao c = new CustomerDaoImpl();
		Customer a = c.retrieveByUser("coolgirl");
		String result = a.getUsername();
		assertEquals(result, "coolgirl");
	}
	@Test
	public void updatePassTest() throws SQLException {
		String newpass = "cool";
		CustomerDao c = new CustomerDaoImpl();
		Customer a = c.retrieveByUser("coolgirl");
		c.updatePass("coolgirl", a, newpass);
		String result = a.getPassword();
		assertEquals(result, newpass);
	}
	@Test
	public void depositTest() throws SQLException {
		int amount = 20;
		CustomerDao c = new CustomerDaoImpl();
		Customer a = c.retrieveByUser("coolgirl");
		c.deposit(amount, a, a.getUsername());
		int modBalance = (int) (a.getBalance() + amount);
		assertEquals(modBalance, (int) a.getBalance() + amount);
	}

}
