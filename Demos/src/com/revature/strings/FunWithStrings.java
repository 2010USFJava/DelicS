package com.revature.strings;

public class FunWithStrings {
	public static void main(String []args) {
		String s="dog";
		String a="dog";
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		//pointing to the same memory location
		
		a=a+"house";
		System.out.println(a.hashCode());
		//should be pointing to a different location now, because it
		//is a completely new string
		System.out.println(s.charAt(2));
		//char at anything out of bounds will create an error
		StringBuilder sb= new StringBuilder("What's up");
		StringBuilder sb2= new StringBuilder("What's up");
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		//this will print the same memory location even though
		//they can have different values or modifications between each
		//this means they are mutable
	}
}
