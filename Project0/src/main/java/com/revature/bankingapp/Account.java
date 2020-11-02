package com.revature.bankingapp;

import java.util.Scanner;
import java.lang.*;

public class Account {
	Scanner scanner = new Scanner(System.in);
	
	private int balance;
	
	public void deposit(int amount) {
		if(amount>= 1) {
			balance = balance + amount;
			
			System.out.println("Your current balance is $" + balance + ".");
			accountModifications();

		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");
			accountModifications();
		}
	}
	public void withdraw(int amount) {
		if(amount>= 1) {
			balance = balance - amount;
			
			System.out.println("Your current balance is $" + balance + ".");
			accountModifications();
		}else {
			System.out.println('\n' + "Please enter a value that is not zero or negative.");
			accountModifications();
			}
	}
	public void showBalance() {
		System.out.println("Your current balance is $" + balance + ".");
		accountDisplayCustomer();
	}
	public void loginScreen() {
		
		System.out.println(
				"[1] Customer" + '\n' + 
				"[2] Employee" + '\n' + 
				"[3] Admin");

		int portalChoice = scanner.nextInt();
		
		switch (portalChoice){
			case 1:
				accountDisplayCustomer();
				break;
			case 2:
				accountDisplayEmployee();
			case 3:
				accountDisplayAdmin();
				break;
			default:
				System.out.println('\n' + "Not an option, chose 1, 2, or 3");
				loginScreen();
		}
	}
	
	public void accountDisplayCustomer() {
		System.out.println(
				"[1] Apply for an account"  + '\n' +
				"[2] Apply for a joint account" + '\n' + 
				"[3] View your account information" + '\n' + 
				"[4] View Account Balances" + '\n' +
				"[5] Quit");
		int customerChoice = scanner.nextInt();
		switch (customerChoice) {
		case 1:
			accountModifications();
			break;
		case 2:
			accountModifications2();
			break;
		case 3:
			break;
		case 4:
			loginScreen();
		default:
			System.out.println('\n' + "Sorry, that is not an option.");
			accountDisplayCustomer();
			break;			
		}		
	}
	public void accountModifications() {
		System.out.println("Enter a number to label this account");
		int choseNumber = scanner.nextInt();
		System.out.println('\n' + "Enter the amount you want to deposit to start your account.");
		int startAmount = scanner.nextInt();// handle negatives
		Customer a = new Customer(choseNumber, startAmount);
		
		System.out.println('\n' + "Select an option" + '\n' +
				"[1] Show Balance" + '\n' +
				"[2] Deposit" + '\n' +
				"[3] Withdraw" + '\n' +
				"[4] Quit");
			int customerChoice2 = scanner.nextInt();
			switch (customerChoice2) {
			case 1: 
				int balance = 0;
				if(balance != 0) {
					showBalance();
				}else {
					System.out.println('\n' + "Your balance is Zero.");
					accountModifications();
				}
				break;
			case 2:
				System.out.println('\n' + "Enter an amount.");
				int addition = scanner.nextInt();
				deposit(addition);
				
				break;
			case 3: 
				System.out.println('\n' + "Enter an amount.");
				int decrease = scanner.nextInt();
				withdraw(decrease);
				
				break;
			case 4: 
				accountDisplayCustomer();
				break;
			default:
				System.out.println('\n' + "Sorry, not an option");
				accountModifications();
				break;
			}
	}
	public void accountModifications2() {
		
	}
	
	public void accountDisplayEmployee() { 
		System.out.println(CustomerList.customerList.toString());
		System.out.println("Enter the Username of the customer you want to select.");
		String employeePick = scanner.nextLine();
		Customer employeePickA = CustomerList.findCustomerByUsername(employeePick);//finding the objects from the Customer File
		//System.out.println("");
	}
	
	public void accountDisplayAdmin() {
		//approve/deny all accounts
		//withdraw from accounts
		//deposits to accounts
		//cancel accounts
		System.out.println("Enter the Username of the customer you want to select.");
		String adminPick= scanner.nextLine();
		Customer adminPickA = CustomerList.findCustomerByUsername(adminPick);//finding the objects from the Customer File
		System.out.println("");
		//System.out.println("let the battle begin");
		//Fight fight = new Fight(a,b)
		//fight.fightTime(a, b);//log the results
		//LogThis.LogIt("info", a.getName() +"just punched" b.getName()+"and it costs them " + a.getAttack Power() + "points of damage");
		
	}
	/*public void transfer(Warrior a, Warrior b) {
		//a is going to hit b
		int firstAttackPower = a.getAttackPower();
		int secondHP = b.getHP();
		
		b.setHp(secondHp-firstAttackPower); //update a value which would be stored in our arraylist
		FileStuff.writeWarriorFile(Roster.warriorList);
	}*/
}

