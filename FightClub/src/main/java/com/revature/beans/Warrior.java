package com.revature.beans;

import java.io.Serializable;

import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Warrior implements Serializable{
private String name;
private int hp;
private int attackPower;

//whenevr we create a new warrior, add teh warrior to the array list

public Warrior() {
	super();
	Roster.warriorList.add(this);//because we are referring to the objects that is being created at that time
	//if we didn't write the array list there is a possibility that we could lose the info
	FileStuff.writeWarriorFile(Roster.warriorList);
}
//it will save to the arrayList
//write it to a file in the constructor

public Warrior(String name, int hp, int attackPower) {
	super();
	this.name = name;
	this.hp = hp;
	this.attackPower = attackPower;
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
public int getAttackPower() {
	return attackPower;
}
public void setAttackPower(int attackPower) {
	this.attackPower = attackPower;
}
@Override
public String toString() {
	return "Warrior [name=" + name + ", hp=" + hp + ", attackPower=" + attackPower + "]";
}


}
