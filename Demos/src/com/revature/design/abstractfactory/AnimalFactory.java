package com.revature.design.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(Animal t) {
		if (t.getAnimal().equalsIgnoreCase("Quokka")){
			return new Quokka();
		}else if (t.getAnimal().equalsIgnoreCase("Duck")){
			return new Duck();
		}else id (t.getAnimal().equalsIgnoreCase("Fox")){
		return null;
		}
	}

}
