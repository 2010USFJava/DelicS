package com.revature.maps;
import java.util.Map;
import java.util.HashMap;

public class Maps {
	public static void main(String[]args) {
	
	//Maps, an object that maps 'keys' to 'values' (also known as disctionary in other languages).
	//Each key has to be unique and can be mapped to only value. Not that a key can be mapped 
	//to duplicate values.
	
	Map<String,String> myMap =new HashMap<>();
	myMap.put("apples", "a red or green thing");
	myMap.put("Earth", "a blue thing");
	myMap.put("Earth", "filled with water");
	myMap.put("Grapes", "a red or green thing");
	System.out.println(myMap);
	
	//myMap.get("apples"); //an object is used since maps work with objects
	System.out.println(myMap.get("apples"));
	
	Map<Key,String> specialMap = new HashMap<>();
	//in a hashmap you can use null. but setting a different value will override the previous one
	Key myKey = new Key("mercury");
	specialMap.put(myKey,  "My key to Mercury");
	
	myKey = null;
	myKey = newKey("Mercury");
	
	System.out.println(specialMap.get(myKey));
	System.out.println(myMap.keySet());
	System.out.println(myMap.values());
	System.out.println(myMap.entrySet());
	
	for(String s: myMap.keySet(){
		System.out.println(myMap.get(s)); //psuedo indirect way of iterating through the set
	}
	}
	
}
