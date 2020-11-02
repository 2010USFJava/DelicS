package com.revature.iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	//Iterator all of these implement the Iterable interface only iterables can be used
	//in for each loops Inerface, when implemented allows the implementing type to be the subject
	//of a for each loop. every collection has an iterator which allows traversal
	public static void main(String[] args) {
		//create an arraylist
		List<String> = new ArrayList<String>();
		//create and add elements
		a1.add("C");
		a1.add("D");
		System.out.println("Original contents of a1: ");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.print("element+ ");
			//modify objects being iterated
			ListIterator<String> litr=a1.listIterator();
			while(litr.hasNext()) {
				String bettyWhite = litr.next();//hasnext will check . next will grab that specefic value
				litr.set(bettyWhite+"+");
			}
		}
	}
}
