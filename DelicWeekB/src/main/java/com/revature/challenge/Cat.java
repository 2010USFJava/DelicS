package com.revature.challenge;

import java.io.Serializable;

public class Cat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 312459474189382936L;
	private String name;
	private String breed;
	private String howCute;
	private int legs;
	
	public Cat() {
		super();
		CatList.catList.add(this);//because we are referring to the objects that is being created at that time
		//if we didn't write the array list there is a possibility that we could lose the info
		CatFile.writeCatFile(CatList.catList);
		//it will save to the arraylist and write to a file in the constructor.
	}

	public Cat(String name, String breed, String howCute, int legs) {
		super();
		this.name = name;
		this.breed = breed;
		this.howCute = howCute;
		this.legs = legs;
		CatList.catList.add(this);
		CatFile.writeCatFile(CatList.catList);
		LogThis.LogIt("info", "A new kitty, "+ this.name + ", is here!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getHowCute() {
		return howCute;
	}

	public void setHowCute(String howCute) {
		this.howCute = howCute;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", breed=" + breed + ", howCute=" + howCute + ", legs=" + legs + "]";
	}
	
	
}
