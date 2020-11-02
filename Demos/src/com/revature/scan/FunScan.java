package com.revature.scan;

import java.util.Scanner;

public class FunScan {
	public static Scanner sc= new Scanner(System.in);
	
	public static void printMe() {
		String contents;
		System.out.println("What would you like to print?");
		contents =sc.next();
		System.out.println(contents);
		System.out.println("What else would you like to print?");
		String moreContents =sc.next();
		System.out.println(moreContents);
		System.out.println("What number would you like to print?");
		String num=sc.nextLine();
		int myNum=Integer.parseInt(num);
		System.out.println(myNum+4);
	}
	public static void main(String[] args) {
		printMe();
	}
}
