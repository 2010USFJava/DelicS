package com.revature.service;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;

public class Fight {
	public void fightTime(Warrior a, Warrior b) {
		//a is going to hit b
		int firstAttackPower = a.getAttackPower();
		int secondHP = b.getHP();
		
		b.setHp(secondHp-firstAttackPower); //update a value which would be stored in our arraylist
		FileStuff.writeWarriorFile(Roster.warriorList);
	}
}
