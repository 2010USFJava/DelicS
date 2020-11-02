package com.revature.varargs;

public class FunWithVarargs {
	public static void main(String []args) {
		vaTest("hey", 6); //you can put in number of args here where .length is our counter
	}
	static void vaTest(String s, int... v) { //we will take a variable number of arguments that are type int
		System.out.println("Number of Args is : " + v.length + " Contents:");
		for (int x:v) {
			System.out.println(x);
		}
	}
}
