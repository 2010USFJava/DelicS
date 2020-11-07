package com.revature.design;
// Single design pattern, ensure a class has only one instance and provides a global access to it
public class Singleton {
//private static property of itself/ the self class
	private static Singleton instance; //a private static instance of itself
		
	//private constructor
	private Singleton() {
		//logic here 
	}
	//we can not 
	//public Static synchronized method to get the unique instance- if it does not exist, 
	//we will create it.
	public static synchronized Singleton getInstance() {//then two threads that are trying to access it at the same time are both trying to make an instance of it
	//each thread gets its own stack memory. Each thread can have a variable that points to a different location in the heap. synchronized
		//makes it so that that will not happen. it will have one and only one instance in memory. 
		//synchronized 
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void doSomething() {
		//what the object should do
	}
}
