package com.revature.generics;

public class GenDemo {
	public static void main(String[] args) {
		//Create a gen1 reference for integers
		Gen1<Integer> i;
		i= new Gen1<Integer>(88);
		
		//show the type of i
		i.showType();
		//get the value of i
		int v= i.getObject();
		System.out.println("value: " +v);
		
		Gen1<String> s= new Gen1<String>("Generics Test");
		s.showType();
		String str=s.getObject();
		System.out.println("value: "+str);
	}
		
	
}
