package com.revature.threads;

public class ThreadDemo {
 public static void main(String[] args) {
	 Thread extendThread = new ExtendThread(); //is an extend thread object which is also a thread object
	 Thread implementThread = new Thread(new ImplementRunnablee()); //passing in a class or an object //state is new
	 
	 implementThread.setPriority(10);
	 
	 extendThread.start(); //state is runnable
	 implementThread.start();
	 
	 for(int i = 0; i<100; i++) {
		 System.out.println("Hey from driver");
		 //when we run we see different printouts because printing to the consile is synchronized... sysout is synchronized which is wy
		 //we see different things happening. It can only run one thread at a time
	 }
 }
}
