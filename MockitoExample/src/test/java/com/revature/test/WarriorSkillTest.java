package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.skillset.WarriorSkillSet;

public class WarriorSkillTest {//new junit test. WarriorSkillTest, the last thing is fully qualified class name (packaget.class)

	@BeforeClass
	public static void initialSetUp() { //static method runs before the class
		System.out.println("I run once before everything");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("I run beofre each test");
	}
	@Test
	public void test() {
		assertTrue(true);//asserting that whatever gets passed in is true. & we gave it true
	}
	@Test
	public void test2() {
		//assertFalse(true);
		
		//excpected value vs. the actual value 
		assertEquals(3,3);
	}
	@Test
	public void basicAttackTest() {
		WarriorSkillSet wss = new WarriorSkillSet();
		int actual= wss.basicAttack();
		assertEquals(5, actual);
				//have our method run and set the value we get back to the int actual value
	}
	
	@Test 
	public void powerAttackTest() {
		WarriorSkillSet wss = new WarriorSkillSet();
		int expected = 10;
		int actual = wss.powerAttack();
		assertEquals(expected,actual);
	}
	//bad
	@Test 
	public void powerAttackBadtest() {
		WarriorSkillSet wss = new WarriorSkillSet();
		int expected = (wss.basicAttack()*4)/2;
		int actual = wss.powerAttack();
		assertEquals(expected,actual);
	}
	public void runAfterEachTest(Test info) {//pass in a test info object
		
	}
}
