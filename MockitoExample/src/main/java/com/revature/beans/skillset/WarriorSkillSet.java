package com.revature.beans.skillset;

import com.revature.beans.SkillSet;

public class WarriorSkillSet implements SkillSet{//each game character can have different was of how they come up with their attack power

	public int basicAttack() {
		// lots of logic
		return 5;
	}

	public int powerAttack() {
		int basic = basicAttack();
		int power = (basic*4)/2;
		return power;
	}

}
