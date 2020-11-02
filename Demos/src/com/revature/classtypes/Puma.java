package com.revature.classtypes;

public class Puma extends Mammal {

	private boolean isCapableOfMurderingPeople;
	
	public void breathe() {
		System.out.println("I breathe through my nose");
	}
	
	public Puma(){
		
	}
	public Puma(boolean isCapableOfMurderingPeople) {
	this.isCapableOfMurderingPeople=isCapableOfMurderingPeople;
	}
	public void findPrey() {
		System.out.println("I stalk things in the forest");
	}
	//here, we need to override the method in the Hunt interface. You may not have to override 
	//a method until far down the inheritance chain

	@Override
	public String toString() {
		return "Puma [isCapableOfMurderingPeople=" + isCapableOfMurderingPeople + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
