package com.revature.beans;

public class GameCharacter {
private String name;
private int hp;
private SkillSet skillset; //maybe like account?

public GameCharacter() {
	
}

public GameCharacter(String name, int hp, SkillSet skillset) {
	super();
	this.name = name;
	this.hp = hp;
	this.skillset = skillset;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public SkillSet getSkillset() {
	return skillset;
}
public void setSkillset(SkillSet skillset) {
	this.skillset = skillset;
}
@Override
public String toString() {
	return "GameCharacter [name=" + name + ", hp=" + hp + ", skillset=" + skillset + "]";
}


}
