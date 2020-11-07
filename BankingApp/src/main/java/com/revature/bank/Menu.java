package com.revature.bank;
import java.util.*;

public class Menu extends Roster{
static Scanner scanner = new Scanner(System.in);	
static boolean accountOn;
	
	public static void startMenu(){
		System.out.flush();
		System.out.println("Register Below");
		System.out.println("Select which user you are" +
					"\n===================================================" +
					'\n' + "[2] Customer " +
					'\n' + "[3] Employee " +
					'\n' + "[4] Admin ");
			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("Register a username.");
				String username = scanner.next();
				System.out.println("Register a password");
				String password = scanner.next();
				//User a = new User(username, password);
				System.out.println("Your username and passwrod have been stored.Login is below.");
				//System.out.println(Roster.userList.toString());
				loginPortalC();
			
				break;
			case 2:
				System.out.println("Register a username.");
				String usernameE = scanner.next();
				System.out.println("Register a password");
				String passwordE = scanner.next();
				Employee aE = new Employee(usernameE, passwordE);
				System.out.println("Your username and password have been stored. Login is below");
				//System.out.println(Roster.userList.toString());
				loginPortalE();
				
				break;
			case 3:
				System.out.println("Register a username.");
				String usernameA = scanner.next();
				System.out.println("Register a password");
				String passwordA = scanner.next();
				Admin aA = new Admin(usernameA, passwordA);
				System.out.println("Your username and password have been stored. Login is below");
				//System.out.println(Roster.userList.toString());
				loginPortalA();
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
				'\n' + "[2] Customer " +
				'\n' + "[3] Employee " +
				'\n' + "[4] Admin ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter your username.");
			String username = scanner.nextLine();
			System.out.println("Enter your password");
			String password = scanner.nextLine();
			if (username == ) {
				if (password ==) {
					//log in
				}
			}else {
				System.out.println("\n Either your username or password is invalid.");
				loginPortal();
			}
			break;
		case 2:
			loginPortalE();
			break;
		case 3:
			loginPortalA();
		}
		
	}
	public static void loginPortalC() {
		System.out.println("Input username");
		String input = scanner.next();
		System.out.println("Input password");
		String passInput = scanner.nextLine();
		for (int i = 0; i < customerList.size(); i++) {
		    if (customerList.get(i).equals(input)) {
		        if (customerList.get(i).equals(passInput)) {
		        	optionsC();
		        }
		}else {
			System.out.println("Invalid username or password.");
		}
	}
	}
	public static void loginPortalE() {
		System.out.println("Input username");
		String input = scanner.nextLine();
		System.out.println("Input password");
		String passInput = scanner.nextLine();
		for (int i = 0; i < employeeList.size(); i++) {
		    if (employeeList.get(i).equals(input))
		        if (employeeList.get(i).equals(passInput)) {
		        	optionsE();
		        }
		}
	}
	public static void loginPortalA() {
		System.out.println("Input username");
		String input = scanner.nextLine();
		System.out.println("Input password");
		String passInput = scanner.nextLine();
		for (int i = 0; i < adminList.size(); i++) {
		    if (adminList.get(i).equals(input))
		        if (adminList.get(i).equals(passInput)) {
		        	optionsA();
		        }
		}
	}
	public static void optionsC(){
		if (accountOn == true) {
			System.out.println("Enter your first name, the name to be associated with the account.");
			String name = scanner.nextLine();
		Customer a = new Customer(name, null, 0);
		System.out.println("Select an option from the list below");
		}else {
			System.out.println("Your account was denied");
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
			accountOn = true;
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
			//transfer method( fight method)
			break;
		case 5:
			System.out.println("Enter the account ID for the account that you wish to remove");
			int acct = scanner.nextInt();
			//acct.parse
			//removeAccountByID(acct);
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
