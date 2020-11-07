package com.revature.design.abstractfactory;

public interface AbstractFactory<T>{
	T create (T t);//doing it this way it can be used for anything ... generic. We have the logic of creating something.
	//we are returning an object of type t
}
