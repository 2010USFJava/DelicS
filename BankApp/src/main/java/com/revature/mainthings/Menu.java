package com.revature.mainthings;
import java.util.*;
import com.revature.fileslogging.*;
import com.revature.users.*;


public class Menu{
static Scanner scanner = new Scanner(System.in);	
	
	public static void startMenu(){
		System.out.flush();
		System.out.println("[1] Customer Register" +
					"\n[2] Employee Reginster" +
					"\n[3] Admin Register" +
					"\n===================================================" +
					'\n' + "[4] Login \n");
			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("CUSTOMER \n");
				System.out.println("Register a username. \n");
				String username = scanner.next();
				System.out.println("Register a password \n");
				String password = scanner.next();
				Customer c = new Customer(username, password);
				System.out.println("Your username and passwrod have been stored. Login is below.");
				startMenu();
				break;
			case 2:
				System.out.println("EMPLOYEE \n");
				System.out.println("Register a username. \n");
				String usernameE = scanner.next();
				System.out.println("Register a password \n");
				String passwordE = scanner.next();
				Employee e = new Employee(usernameE, passwordE);
				System.out.println("Your username and passwrod have been stored. Login is below.");
				startMenu();
				break;
			case 3:
				System.out.println("ADMIN \n");
				System.out.println("Register a username. \n");
				String usernameA = scanner.next();
				System.out.println("Register a password \n");
				String passwordA = scanner.next();
				Admin a = new Admin(usernameA, passwordA);
				System.out.println("Your username and passwrod have been stored. Login is below.");
				startMenu();
			case 4:
				loginPortal();
				break;
			default:
				System.out.println(" \n Not an option.");
				startMenu();
				break;
			}		
	}

	public static void loginPortal() {
		System.out.println("Select which login portal you will use." +
				"\n===================================================" +
				'\n' + "[1] Customer " +
				'\n' + "[2] Employee " +
				'\n' + "[3] Admin ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			loginPortalC();
			break;
		case 2:
			loginPortalE();
			break;
		case 3:
			loginPortalA();
			break;
		default:
			System.out.println("Not an option.");
			loginPortal();
			break;
		}
		
	}
	public static void loginPortalC() {
		System.out.println(Roster.customerList);
		System.out.println("Input username");
		String input = scanner.next();
		System.out.println("Input password");
		String passInput = scanner.next();
		for (int i = 0; i < Roster.customerList.size(); i++) {
		    if (Roster.customerList.get(i).equals(input) && Roster.customerList.get(i).equals(passInput)) {
		        	optionsC();
		        }else {
		        	System.out.println("Invalid username or password.");
		        	loginPortalC();
		        }
		}
	}
	public static void loginPortalE() {
		System.out.println("Input username");
		String input = scanner.nextLine();
		System.out.println("Input password");
		String passInput = scanner.nextLine();
		for (int i = 0; i < Roster.employeeList.size(); i++) {
		    if (Roster.employeeList.get(i).equals(input))
		        if (Roster.employeeList.get(i).equals(passInput)) {
		        	optionsE();
		        }else {
					System.out.println("Invalid username or password.");
		        }
		}
	}
	public static void loginPortalA() {
		System.out.println("Input username");
		String input = scanner.nextLine();
		System.out.println("Input password");
		String passInput = scanner.nextLine();
		for (int i = 0; i < Roster.adminList.size(); i++) {
		    if (Roster.adminList.get(i).equals(input))
		        if (Roster.adminList.get(i).equals(passInput)) {
		        	optionsA();
		        }else {
					System.out.println("Invalid username or password.");
				}
		}
	}
	public static void optionsC(){
		
		System.out.println("Enter your first name, the name to be associated with the account.");
		String name = scanner.next();
		Customer a = new Customer(name);
		if (a.getAccountOn() == true) {
		System.out.println("Select an option from the list below." +
				"\n [1] Apply for joint account" +
				"\n [2] Deposit" +
				"\n [3] Withdraw" +
				"\n [4] Transfer" +
				"\n [5] Quit \n");
		int userChoice = scanner.nextInt();
		switch (userChoice) {
		case 1:
			System.out.println("Modify the names associated with the account. Separate your name and the other with a comma. \n");
			String newNames = scanner.nextLine();
			Customer newName = new Customer(newNames);
			//add to this. new name needs to be able to access the account
			break;
		case 2:
			System.out.println("Enter the ammount you would like to add to your account. \n");
			int userAmount = scanner.nextInt();
			Account.deposit(userAmount);
			optionsC();
			break;
		case 3:
			System.out.println("Enter the amount you would like to subtract from your account. \n");
			int userAmount2 = scanner.nextInt();
			Account.withdraw(userAmount2);
			optionsC();
			break;
		case 4:
			System.out.println("Enter the amount you would like to send to another account. \n");
			int userAmount3 = scanner.nextInt(); 
			System.out.println("Enter your accountnumber. \n");
			int userAccountNumber1 = scanner.nextInt();
			Customer c1 = Roster.findCustomerByID(userAccountNumber1);
			System.out.println("Enter the user account number that you would like to transfer to.");
			int userAccountNumber2 = scanner.nextInt();
			Customer c2 = Roster.findCustomerByID(userAccountNumber2);
			Account.transfer(userAmount3, c1, c2);
			break;
		case 5:
			loginPortal();
			break;
		default:
			System.out.println("\n Sorry, not an option. \n");
			optionsC();
			break;
		}
		
		}else {
			System.out.println("Your account was denied");
			loginPortal();
	}
}
		
	
	public static void optionsE() {
		
		System.out.println("Enter your username.");
		String username = scanner.nextLine();
		System.out.println("Enter your password");
		String password = scanner.nextLine();
		System.out.println("Choose an option." +
							"\n [1] Approve an account" +
							"\n [2] Deny an account" +
							"\n [3] View account information" +
							"\n [4] Transfer funds" +
							"\n [5] Remove account");
		int option = scanner.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Select the account number you want to approve.");
			long userChoice = scanner.nextLong();
			Roster.denyAccount(userChoice);
			System.out.println("The account is approved");
			optionsE();
			break;
		case 2:
			System.out.println("The account is denied");
			optionsE();
			break;
		case 3:
			System.out.println(Roster.customerList.toString());
			System.out.println("Select the account ID that contains the information you wish to view");
			//make the view method
			break;
		case 4:
			System.out.println("Enter the amount you would like to send to another account. \n");
			int userAmount3 = scanner.nextInt(); //amount
			System.out.println("Enter your accountnumber. \n");
			int userAccountNumber1 = scanner.nextInt();
			Customer c1 = Roster.findCustomerByID(userAccountNumber1);
			System.out.println("Enter the user account number that you would like to transfer to.");
			int userAccountNumber2 = scanner.nextInt();
			Customer c2 = Roster.findCustomerByID(userAccountNumber2);
			Account.transfer(userAmount3, c1, c2);
			break;
		case 5:
			System.out.println("Enter the account ID for the account that you wish to remove");
			long acct = scanner.nextInt();
			Roster.removeAccountByID(acct);
		}
		
	}
	public static void optionsA() {
		//System.out.println(Roster.customerList.toString());
		System.out.println("Enter your username.");
		String username = scanner.nextLine();
		System.out.println("Enter your password");
		String password = scanner.nextLine();
		System.out.println("Choose an option." +
							"\n [1] Approve an account" +
							"\n [2] Deny an account" +
							"\n [3] View account information" +
							"\n [4] Transfer funds" +
							"\n [5] Remove account");
		int option = scanner.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Select the user for the account you will be approving");
			int optionAccount = scanner.nextInt();
			boolean accountON = true;
			System.out.println("The account is approved!");
		
		case 2:
			System.out.println("Select which account number you will be denying");
			//String deny= scan.nextLine();
			
			break;
		case 3:
			System.out.println(Roster.customerList.toString());
			break;
		case 4:
			

		
		}
	}
/*
	public static void fightMenu() {
		System.out.println("Enter the name of your first Warrior");
		String first= scan.nextLine();
		Warrior a= Roster.findWarriorByName(first);
		System.out.println("Enter the name of your second Warrior");
		String second= scan.nextLine();
		Warrior b= Roster.findWarriorByName(second);
		System.out.println("LET THE BATTLE BEGIN!!");
		Fight fight= new Fight();
		fight.fightTime(a, b);
		LogThis.LogIt("info", a.getName()+" just punched "+ b.getName()+" and it costs them " +a.getAttackPower()+ 
				" points of damage");
		System.out.println(b.getName()+ "'s HP is now "+b.getHp());
	}*/
}
