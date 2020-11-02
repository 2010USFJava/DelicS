package com.revature.util;
import com.revature.beans.Warrior;
import com.revature.menu.Menu;

public class Driver {
public static void main(String[] args) {
	
	FileStuff.readWarriorFile();
	/*Warrior mikey = new Warrior("mikey", 200,4);//being written to the file
	Warrior steven = new Warrior("Steven",150,8);
	System.out.println(Roster.warriorList.toString());//print out what is in the file
	System.out.println(Roster.warriorList.get(0).toString());//how we can get from the txt file, this can be used by admin
	//maybe we can get by id or something*/
	Menu.startMenu();
}
}
