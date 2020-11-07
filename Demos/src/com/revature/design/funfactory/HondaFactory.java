package com.revature.design.funfactory;
//create the object without exposing the creation logic to the client. Abstraction
public class HondaFactory {
//we use a factory method to return a car model based on what string is given
//if the method is given a parameter of something besides srv or sivic it will return null.
	
	public Car getCar(String whatCar, String color) {
		if (whatCar.equals("civic")) {
			return new Car("Honda", 2020, "Civic", color);
		}else if(whatCar.equals("crv")) {
			return new Car("Honda", 2020,"crv", color);
		}
		return null;
	}
}
