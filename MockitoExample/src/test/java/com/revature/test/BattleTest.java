package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.beans.GameCharacter;
import com.revature.beans.SkillSet;
import com.revature.services.Battle;
import com.revature.services.Battle.attackType;

public class BattleTest {
static GameCharacter a;
static GameCharacter b;

	@BeforeClass
	public static void loadFameHCaracters() {
		SkillSet skillSet = Mockito.mock(SkillSet.class);
		a= new GameCharacter("a", 100,skillSet);
		b= new GameCharacter("b", 100,skillSet);
		System.out.println("loaded characters...");
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
	@Test
	public void attackPhaseBasicTest() {
		Mockito.when(a.getSkillset().basicAttack()).thenReturn(10);
		Battle.attackPhase(a, b, attackType.BASIC);//whenever we call saying a use your basic attack against b, we know what
		//we are getting
		int remainingHP = b.getHp();	
		assertEquals(remainingHP, 90);
	}

}
