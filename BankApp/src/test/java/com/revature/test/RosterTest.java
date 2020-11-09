package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.skillset.WarriorSkillSet;
import com.revature.fileslogging.Roster;
import com.revature.users.Customer;

public class RosterTest {
	@BeforeClass
	public static void initialSetUp(){
		System.out.println("Testing");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("Running before each test.");
	}
	@Test
	public void approveAccountTest() {
		Roster customer = new Roster();
		customer.approveAccount(assertTrue(true));
		assertEquals(5, actual);
		assertTrue(true);//asserting that whatever gets passed in is true. & we gave it true
	}
	@Test
	public void findUserByUsername() {
	
		assertEquals();
	}
	public void runAfterEachTest(Test info) {//pass in a test info object
		
	}
}
