package com.revature.services;

import com.revature.beans.GameCharacter;

public class Battle {
	public enum attackType{
		BASIC,
		POWER
	}
	public static void attackPhase(GameCharacter a, GameCharacter b, attackType aType) {
		int bHP = b.getHP();
		int aAP= a.getHp();
		if(attackType.equals(BASIC)) {
			a.getSkillset().basicAttack();
		}else if (attackType.equals(POWER)) {
			a.getSkillset().powerAttack();
		}else {
			System.out.println("How did you mess this up ");
		}
		b.setHp(bHP);
	}
}
