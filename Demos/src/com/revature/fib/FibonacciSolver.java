package com.revature.fib;

public class FibonacciSolver {
	public static void main(String[] args) {
	
	//System.out.println(fibonacciIteration(5));
	System.out.println(fibonacciRecursion(5));
	}
	public static int fibonacciIteration(int nthNumber) {
		//use iterations -> loop
		int previousNumber = 0;
		int previouspreviousNumber = 0;
		int currentNumber = 1;
		
		for(int i=1; i<nthNumber; i++) {
			System.out.println("===================================");
			System.out.println("currentNumber is " + currentNumber);
			System.out.println("previousNumber is " + previousNumber);
			System.out.println("previouspreviousNumber is " + previouspreviousNumber);
			previouspreviousNumber=previousNumber;
			previousNumber=currentNumber;
			currentNumber= previouspreviousNumber + previousNumber;
		
			
		}
		return currentNumber;
	}
	public static int fibonacciRecursion(int nthNumber) {
		if (nthNumber == 0) {
			System.out.println(nthNumber);
			return 0;
		}else if (nthNumber == 1) {
			System.out.println(nthNumber);
			return 1;
		}
		return fibonacciRecursion(nthNumber-1) + fibonacciRecursion(nthNumber-2);
	}
}