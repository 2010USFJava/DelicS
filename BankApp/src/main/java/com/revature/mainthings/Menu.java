package com.revature.mainthings;
import java.util.*;
import com.revature.fileslogging.*;
import com.revature.users.*;


public class Menu{
static Scanner scanner = new Scanner(System.in);	

static Customer c = new Customer();
	public static void startMenu(){
			boolean continueInput = true;
		do {
	       
	    	try {
	        	 System.out.println("[1] Customer Register" +
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
					System.out.println("Register an account number \n");
					int accNumber = scanner.nextInt();
					for (int i = 0; i< Roster.customerList.size(); i++) {
						int number = Roster.customerList.get(i).getAccountNumber();
					if (accNumber == number) {
						System.out.println("Account number already exists. Try to register again.");
						startMenu();
					}else {
						Customer c = new Customer(username, password, null, null, true, accNumber, 0);
						System.out.println("Your username and password have been stored. Login is below.");
						loginPortal();
					}
					}
					break;
				case 2:
					System.out.println("EMPLOYEE \n");
					System.out.println("Register a username. \n");
					String usernameE = scanner.next();
					System.out.println("Register a password \n");
					String passwordE = scanner.next();
					Employee e = new Employee(usernameE, passwordE);
					System.out.println("Your username and password have been stored. Login is below.");
					loginPortal();
					break;
				case 3:
					System.out.println("ADMIN \n");
					System.out.println("Register a username. \n");
					String usernameA = scanner.next();
					System.out.println("Register a password \n");
					String passwordA = scanner.next();
					Admin a = new Admin(usernameA, passwordA);
					System.out.println("Your username and password have been stored. Login is below.");
					loginPortal();
				case 4:
					loginPortal();
					break;
				default:
					System.out.println(" \n Not an option.");
					startMenu();
					break;
				}	
				continueInput = false;
	        }
	        catch (java.util.InputMismatchException e) {
	            e.printStackTrace();
	            scanner.nextLine();
	        }

	}
		while(continueInput);
	}



	public static void loginPortal() {
		boolean continueInput = true;
		do {
			try {
		System.out.println("Select which login portal you will use." +
				"\n===================================================" +
				'\n' + "[1] Customer " +
				'\n' + "[2] Employee " +
				'\n' + "[3] Admin " +
				'\n' + "[4] Back to Register");
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
		case 4:
			startMenu();
		default:
			System.out.println("Not an option.");
			loginPortal();
			break;
		}
		continueInput = false;
		}catch(InputMismatchException e) {
			e.printStackTrace();
			scanner.nextLine();
		}
		}
			while(continueInput);
		}
	
		
	
	public static void loginPortalC() {
		System.out.println(Roster.customerList);
		System.out.println("\n Make a selection." +
						"\n[1] Regular user" +
						"\n[2] Joint User");
		boolean continueInput = true;
		do {
		try {
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Input username");
			String input = scanner.next();
			System.out.println("Input password");
			String passInput = scanner.next();
			if (Roster.findByUandP(input, passInput) != null) {
				//if(Roster.findUserByPassword(passInput) != null){
					optionsC();
				}else {
					System.out.println("Invalid username and password combo.");
				}
		break;
		case 2:
			System.out.println("Input username");
			String input2 = scanner.next();
			System.out.println("Input password");
			String passInput2 = scanner.next();
			if (Roster.findByUandP2(input2, passInput2) != null) {
				//if(Roster.findUserByPassword(passInput) != null){
					optionsC();
				}else {
					System.out.println("Invalid username and password combo.");
				}
			break;
			default:
				System.out.println("Not an option");
				loginPortalC();
				break;
		}
		continueInput = false;
	}
		catch (InputMismatchException e) {
		e.printStackTrace();
		scanner.nextLine();
	}
		}
		while(continueInput);
	}
		



	public static void loginPortalE() {
		//System.out.println(Roster.employeeList);
		System.out.println("Input username");
		String input = scanner.next();
		System.out.println("Input password");
		String passInput = scanner.next();
		if (Roster.findEmployeeByUsername(input) != null) {
			if(Roster.findEmployeeByPassword(passInput) != null){
				optionsE();
			}
			
		}else {
			System.out.println("Invalid username and password combo.");
			loginPortalE();
		}
	}
	public static void loginPortalA() {
		//System.out.println(Roster.adminList.toString());
		System.out.println("Input username");
		String input = scanner.next();
		System.out.println("Input password");
		String passInput = scanner.next();
		if (Roster.findAdminByUsername(input) != null) {
			if(Roster.findAdminByPassword(passInput) != null){
				optionsA();
			}
			
		}else {
			System.out.println("Invalid username and password combo.");
			loginPortalA();
		}
	}
	public static void optionsC(){
		boolean continueInput = true;
		do {
			try {
	System.out.println("Enter your account number");
	int accNo = scanner.nextInt();
	Customer e = Roster.findCustomerByAccount(accNo);
		if (e.getAccountOn() == true) {
		System.out.println("Select an option from the list below." +
				"\n [1] Apply for joint account" +
				"\n [2] View Account Balance"+
				"\n [3] Deposit" +
				"\n [4] Withdraw" +
				"\n [5] Transfer" +
				"\n [6] Quit \n");
		int userChoice = scanner.nextInt();
		switch (userChoice) {
		case 1:
			System.out.println("Enter a username to add to your account.");
			String username2 = scanner.next();
			System.out.println("Enter a password to add to your account");
			String password2 = scanner.next();
			System.out.println("Enter your account number that you will be making joint");
			int userChoice2 = scanner.nextInt();
			Customer d = Roster.findCustomerByAccount(userChoice2);
			d.setUsername2(username2);
			d.setPassword2(password2);
			System.out.println("Go to login.");
			loginPortalC();
			break;
		case 2:
			System.out.println("Enter your account number");
			int userAccountNumber = scanner.nextInt();
			//System.out.println("Your current balance is: ");
			Customer a = Roster.findCustomerByAccount(userAccountNumber);
			Account.viewBalance(a);
			optionsC();
			break;
		case 3:
			System.out.println("Enter your account number. \n");
			int userAccountNumber1 = scanner.nextInt();
			System.out.println("Enter the ammount you would like to add to your account. \n");
			Customer c1 = Roster.findCustomerByAccount(userAccountNumber1);	
			double userAmount = scanner.nextInt();
			Account.deposit(userAmount, c1);
			optionsC();
			break;
		case 4:
			System.out.println("Enter your account number. \n");
			int userAccountNumber2 = scanner.nextInt();
			System.out.println("Enter the amount you would like to subtract from your account. \n");
			double userAmount2 = scanner.nextInt();
			Customer c2 = Roster.findCustomerByAccount(userAccountNumber2);
			Account.withdraw(userAmount2, c2);
			optionsC();
			break;
		case 5:
			System.out.println("Enter the amount you would like to send to another account. \n");
			double userAmount3 = scanner.nextDouble(); 
			System.out.println("Enter your accountnumber. \n");
			int userAccountNumber3 = scanner.nextInt();
			Customer c3 = Roster.findCustomerByAccount(userAccountNumber3);
			System.out.println("Enter the user account number that you would like to transfer to.");
			int userAccountNumber4 = scanner.nextInt();
			Customer c4 = Roster.findCustomerByAccount(userAccountNumber4);
			if (userAmount3 >= 1) {
				Account.transfer(userAmount3, c3, c4);
			}else {
				System.out.println("Invalid procedure");
			}
			optionsC();
			break;
		case 6:
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
		continueInput = false;
	}catch(InputMismatchException e) {
		e.printStackTrace();
		scanner.nextLine();
	}
		}
	while(continueInput);
	
}

	public static void optionsE() {
		boolean continueInput = true;
		do {
		try {
		System.out.println("Choose an option." +
							"\n [1] Approve an account" +
							"\n [2] Deny an account" +
							"\n [3] View account information" +
							"\n [6] Back to Login \n");
		int option = scanner.nextInt();
		
		switch (option) {
		case 1:
			System.out.println(Roster.customerList.toString() + "\n");
			System.out.println("Select the account number you want to approve.");
			int userChoice = scanner.nextInt();
			Customer c5 = Roster.findCustomerByAccount(userChoice);
			Roster.approveAccount(userChoice);
			System.out.println("The account is approved");
			optionsE();
			break;
		case 2:
			System.out.println(Roster.customerList.toString() + "\n");
			System.out.println("Select the account number you want to deny.");
			int userChoice2 = scanner.nextInt();
			Customer c4 = Roster.findCustomerByAccount(userChoice2);
			Roster.denyAccount(userChoice2);
			System.out.println("The account is denied");
			optionsE();
			break;
		case 3:
			System.out.println(Roster.customerList.toString() + "\n");
			optionsE();
			break;
		case 6:
			loginPortal();
			break;
		default:
			System.out.println("Not an option");
			optionsE();
		}
		continueInput = false;
		}catch(InputMismatchException e) {
			e.printStackTrace();
			scanner.nextLine();
		}
			}
		while(continueInput);
		
	}
	public static void optionsA() {
		boolean continueInput = true;
		do {
			try {
		System.out.println("Choose an option." +
				"\n [1] Approve an account" +
				"\n [2] Deny an account" +
				"\n [3] View account information" +
				"\n [4] Transfer funds" +
				"\n [5] Deposit into an account" +
				"\n [6] Withdraw from an account" +
				"\n [7] Remove account" + 
				"\n [8] Back to Login \n");
int option = scanner.nextInt();

switch (option) {
	case 1:
		System.out.println(Roster.customerList.toString() + "\n");
		System.out.println("Select the account number you want to approve.");
		int userChoice = scanner.nextInt();
		Customer c5 = Roster.findCustomerByAccount(userChoice);
		Roster.approveAccount(userChoice);
		System.out.println("The account is approved");
		optionsA();
		break;
	case 2:
		System.out.println(Roster.customerList.toString() + "\n");
		System.out.println("Select the account number you want to deny.");
		int userChoice2 = scanner.nextInt();
		Customer c4 = Roster.findCustomerByAccount(userChoice2);
		Roster.denyAccount(userChoice2);
		System.out.println("The account is denied");
		optionsA();
		break;
	case 3:
		System.out.println(Roster.customerList.toString() + "\n");
		optionsA();
		break;
	case 4:
		do {
			try {
		System.out.println("Enter the amount you would like to send to another account. \n");
		int userAmount3 = scanner.nextInt(); //amount
		System.out.println("Enter the user account number that you would like to transfer from. \n");
		int userAccountNumber1 = scanner.nextInt();
		Customer c1 = Roster.findCustomerByAccount(userAccountNumber1);
		System.out.println("Enter the user account number that you would like to transfer to.");
		int userAccountNumber2 = scanner.nextInt();
		Customer c2 = Roster.findCustomerByAccount(userAccountNumber2);
		Account.transfer(userAmount3, c1, c2);
		System.out.println(Roster.customerList.toString() + "\n");
		optionsA();
		continueInput = false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				scanner.nextLine();
			}
				}
			while(continueInput);
		break;
	case 5:
		do {
		try {
		System.out.println("Enter the account number that you would like to deposit to. \n");
		int userAccountNumber3 = scanner.nextInt();
		System.out.println("Enter the ammount you would like to add to your account. \n");
		Customer c3 = Roster.findCustomerByAccount(userAccountNumber3);
		double userAmount = scanner.nextInt();
		Account.deposit(userAmount, c3);
		optionsA();
		continueInput = false;
		}catch(InputMismatchException e) {
			e.printStackTrace();
			scanner.nextLine();
		}
			}
		while(continueInput);
		break;
	case 6:
		do {
		try {
		System.out.println("Enter the account number you want to withdraw from. \n");
		int userAccountNumber4 = scanner.nextInt();
		System.out.println("Enter the amount you would like to subtract from your account. \n");
		double userAmount4 = scanner.nextInt();
		Customer c7 = Roster.findCustomerByAccount(userAccountNumber4);
		Account.withdraw(userAmount4, c7);
		optionsA();
		continueInput = false;
		}catch(InputMismatchException e) {
		e.printStackTrace();
		scanner.nextLine();
		}
			}
			while(continueInput);
		break;
	case 7:
		do {
		try {
		System.out.println("Enter the account number for the account that you wish to remove");
		int acct = scanner.nextInt();
		Customer c6 = Roster.findCustomerByAccount(acct);
		Roster.removeAccount(c6);
		CustomerFile.writeCustomerFile(Roster.customerList);
		optionsA();
		continueInput = false;
		}catch(InputMismatchException e) {
			e.printStackTrace();
			scanner.nextLine();
		}
			}
		while(continueInput);
		break;
	case 8:
		loginPortal();
		break;
	default:
		System.out.println("Not an option");
		optionsA();
	}
		continueInput = false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				scanner.nextLine();
			}
				}
			while(continueInput);
			
		}

}