package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
static Scanner scan = new Scanner(System.in);

public static void startMenu() {
	System.out.println("Welcome to the game!");
	System.out.println("Please enter a choice");
	System.out.println("");
	//in default statement call the startmenu() method again
	//createmenu() method in 1st case
	//startMenu() method in 2nd case
}
public static void createMenu() {
	System.out.println("Create a new warrior");
	System.out.println("please enter a name or your warrior");
	String warriorName = scan.nextLine;
	System.out.println("Please enter your warrior's hp");
	int warriorHP = Integer.parseInt(scan.nextLine());
	System.out.println("Please enter your warrior's attack power");
	int warriorAttackPower = Integer.parseInt(scan.nextLine());
	
	Warrior a =newWarrior(warriorName,warriorHP,warriorAttackPower); //take NOTE
	LogThis.LogIt("info", a.getName() + "was created!");
	System.out.println(Roster.warriorList.toString());
	
	System.out.println("Would you like to make a new warrior? (y/n)");
	String choice = scan.nextLine();
	if(choice.equalsIgnoreCase("y");{
		createMenu();
	}else if (choice.equalsIgnoreCase("n"){
		startMenu();
	}else {
		System.out.println("you'regoing to the main menu");
		startMenu();
	}
}
public static void FightMenu() {//admin choice method
	System.out.println("Enter the name of your first warrior");
	String first= scan.nextLine();
	Warrior a=Roster.findWarriorByName(first);//finding the objects from the roster
	System.out.println("enter the name of your second warrior");
	String second = scan.nextLine();
		Warrior b=Roster.findWarriorByName(second);
	System.out.println("let the battle begin");
	Fight fight = new Fight();
	fight.fightTime(a, b);//log the results
	LogThis.LogIt("info", a.getName() +"just punched" b.getName()+"and it costs them " + a.getAttack Power() + "points of damage");
	System.out.print(b.getName()+"'s HP is now" +b.getHp());
}
}
