package com.revature.bankingapp;

import java.util.Scanner;


public class Menu {
	Scanner scanner = new Scanner(System.in);
	static Account myAccount = new Account();

	public static void startMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Register a Username");
		String username =scanner.next();
		System.out.println("Register a password");
		String password = scanner.next();
		Customer a = new Customer(username, password);
		LogThis.LogIt("info", a.getUsername() + "was created!");
		myAccount.loginScreen();
		/*System.out.println("Type your password again to guarantee a match");
		String password2 = scanner.next();
		
			if (password != password2) {
			System.out.println("The passwords do not match, try again");
			startMenu();
			}else {
				Customer a = new Customer(username, password);
				LogThis.LogIt("info", a.getUsername() + "was created!");
				myAccount.loginScreen();
				}*/
	}
	public static void createAccount() {	
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Create a new account");
		System.out.println("Please enter the name you want to be associated with the account");
		String customerName = scanner.nextLine();
		System.out.println("Please enter your warrior's hp");
		int warriorHP = Integer.parseInt(scanner.nextLine());
		
		Customer a = new Customer(username,passsword); 
		System.out.println(CustomerList.customerList.toString());
		
		/*System.out.println("Would you like to make a new warrior? (y/n)");
		String choice = scan.nextLine();
		if(choice.equalsIgnoreCase("y");{
			createMenu();
		}else if (choice.equalsIgnoreCase("n"){
			startMenu();
		}else {
			System.out.println("you'regoing to the main menu");
			startMenu()*/
		}
	
	public static void adminChoice() {//admin choice method
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the customer you want to select.");
		String pick= scanner.nextLine();
		Customer a=CustomerList.findCustomerByUsername(pick);//finding the objects from the Customer File
		System.out.println("enter the name of your second warrior");
		String second = scan.nextLine();
			Warrior b=Roster.findWarriorByName(second);
		System.out.println("let the battle begin");
		Fight fight = new Fight();
		fight.fightTime(a, b);//log the results
		LogThis.LogIt("info", a.getName() +"just punched" b.getName()+"and it costs them " + a.getAttack Power() + "points of damage");
		System.out.print(b.getName()+"'s HP is now" +b.getHp());*/
	}
}

