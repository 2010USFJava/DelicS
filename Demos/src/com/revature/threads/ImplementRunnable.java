package com.revature.threads;

public class ImplementRunnable implements Runnable{

	@Override//when we implement an interface we are still able to extend a class, the benefit of extending the thread class
	//vs implementing the runnable interface because we can override those methods in the class. 
	public void run() {
	for(int i = 0; i<100; i++) {
		System.out.println("From the Runnable interface");
	}
	}
}
