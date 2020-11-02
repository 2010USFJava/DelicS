package com.revature.generics;

public class Gen1<T> {//whatever object we feed we will be able to use our methods // T extends Users
//declare an object of type T
	T object; // like a field
//pass the constructor a reference to an object of type T
	Gen1(T objectParameter){
		object=objectParameter;
	}
	//return object of type T
	T getObject() {
		return object;
	}
	//Show type of T
	void showType() {
		System.out.println("Type of T is: "+ object.getClass().getName());
	}
}
// can be used to make one login screen for all three bank app users