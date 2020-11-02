package com.revature.wrappers;

public class Wrappers {
	
	static int myInt=3;
	static Integer myInteger=5;
	static Double myDouble= 45.93;
				
	public static int addEmUp(int a, int b) {
	return a+b;
	}
	public static void main(String [] args) {
		int result =addEmUp(myInt,myDouble.intValue()); //converts the double into an int. It doesn't roun, it just cuts it off
		System.out.println(result);
	//something is happening called unboxing. Unboxes the 
	//wrapper to the primitive type. This is expensive. Takes
	//a lot of resources from the computer
	Integer i=0;
	i =i.MAX_VALUE;
	System.out.println(i); //2147483647
	}
}
