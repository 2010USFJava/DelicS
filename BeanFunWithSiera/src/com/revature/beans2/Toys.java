package com.revature.beans2;

public class Toys {

public Toys() {
}
	
private String toyType;
private String color;
private int petSatisfaction;

public Toys(String toyType, String color, int petSatisfaction) {
this.toyType =toyType;
this.color = color;
this.petSatisfaction = petSatisfaction; //out of 10
}

//getters and setters
public String getToyType() {
	return toyType;
}
public void setToyType(String toyType) {
	this.toyType = toyType;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPetSatisfaction() {
	return petSatisfaction;
}
public void setPetSatisfaction(int petSatisfaction) {
	this.petSatisfaction = petSatisfaction;
}

@Override
public String toString() {
	return "Toys [toyType=" + toyType + ", color=" + color + ", petSatisfaction=" + petSatisfaction + " out of 10 ]";
}


}
