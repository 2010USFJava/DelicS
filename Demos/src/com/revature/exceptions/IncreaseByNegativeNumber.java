package com.revature.exceptions;

public class IncreaseByNegativeNumber extends RuntimeException{
	private static final long serialVersionUID = -19383948992849384L;
		public IncreaseByNegativeNumber() {
		System.out.println("nice job, nerd");
	}
}
//public void increaseAgeBy(int x) throws IncreasedByNegativeNumber{
//if (x,=0) {
//	throw new IncreasedByNegativeNumber();
//}
//with catch(here goes the exception type ){
// e.printStackTrace(); (the red that pops up is the stacktrace)
//}