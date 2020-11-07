package com.revature.design.abstractfactory;

public class ColorFactory implements AbstractFactory{

	@Override
	public Color create(Color t) {
		if(t.getColor().equalsIgnoreCase("Green")){
			return new Green();
		}else if (t.getColor().equalsIgnoreCase("Pink")) {
			return new Pink();
		}
		return null;
	}
}
