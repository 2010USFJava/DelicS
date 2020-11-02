package com.revature.overloading;

public class Calculator {
	public static int addNumbers(int a, int b) {//original
		return a+b;
	}
	public static int addNumbers(int a, int b, int c) {//exact
		return a+b+c;
	}
	public static double addNumbers(double a, double b) {//conversion
		return a+b;
	}
	public static int addNumbers(int...a) {//varargs
		int sum =0;
		for(int x: a) {
			sum += x;
			//System.out.println(x);
		}
		return sum;
	}
	public static Integer addNumbers(Integer a, Integer b) {//boxing
		return a+b;
	}
	
	public static void main(String[]args) {
		System.out.println(addNumbers(6,2));
		System.out.println(addNumbers(6,7,8));
		System.out.println(addNumbers(7.5, 2.0));
		System.out.println(addNumbers(4, 10));
		System.out.println(addNumbers(1,3,4,5,2));
	}
	
}
