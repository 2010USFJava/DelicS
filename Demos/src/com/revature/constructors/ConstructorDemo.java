package com.revature.constructors;

public class ConstructorDemo {
	public static void main(String [] args) {
		C c =new C();
	}
}

class A{
	A(){
		System.out.println("inside A's Constructor");
	}
}

class B extends A{
	B(){
		System.out.println("inside B's Constructor");
	}
}

class C extends A{
	C(){
		System.out.println("insice C's Constructor");
	}
}