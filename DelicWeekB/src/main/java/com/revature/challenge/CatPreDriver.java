package com.revature.challenge;
import java.util.Scanner;

public class CatPreDriver {

	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome! Please establish your cat's name.");
		String name = scanner.nextLine();
		System.out.println('\n' + "What is you cat's breed?");
		String breed = scanner.nextLine();
		System.out.println('\n' + "Please with a few words, say how cute your cat is.");
		String cuteCat = scanner.nextLine();
		System.out.println('\n' + "Finally, enter the number of legs your cat has.");
		int catLegs = scanner.nextInt();
		
		Cat a = new Cat(name, breed, cuteCat, catLegs);
		LogThis.LogIt("info", a.getName() + " was created!");
		System.out.println(CatList.catList.toString());
		
		System.out.println('\n' + "Lets add more cats! (y/n)");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("y")) {
		mainMenu();
		}else {
			System.out.println("Ok, bye!");
		}
	}
	}

