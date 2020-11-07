package com.revature.design.abstractfactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice) {// we are abstracting further and further away from the creation logic
		//or the constructor. The client is going to be working with the factory provider instead of with anything else directly.
		if (choice.equalsIgnoreCase("Animal")) {
			return new AnimalFactory();
		}else if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}
