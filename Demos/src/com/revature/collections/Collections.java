package com.revature.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Collections {
	public static void main(String []args) {
		
		String [] arrayString;
		arrayString = new String [3]; //declaration and assignment
		
		arrayString[0] = "Hi there!";
		int[][][][][] arrayInt = new int[3][3][10][3][3];
		
		arrayInt[0][0][0][0][1] = 1;
		
		//System.out.print(arrayString[0]);
		arrayString = new String[10]; //created a whole new array to resize it
		
		/*
		for (String x: arrayString) { //in the enhanced for loop we actually get the object itself
			System.out.println(x);
		}
		*/
		for (int[][][][] x:arrayInt) {
			for(int[][][] y: x) {
				for(int[][] z:y) {
					
				}
			}
		}
		
		//Collections
		//LIST
		List<String> stringList = new ArrayList<>(); //we're missing the size because the size is dynamic
		stringList.add("Hi there");
		stringList.add("Hi there");
		stringList.add("the end");
		stringList.add("goodbye");
		stringList.add(2, "number 21"); //2 denotes the positon, but tge position has to already exist
		
		//Collection<String> list = new arrayList<>(); //this works because a child class of the list is stil
		//a child class of collection.
		
		stringList.listIterator();
		
		List<String> otherList = new LinkedList<>();
		otherList.add("Apples");
		otherList.add("Kiwi");
		otherList.add("Bananna");
		//System.out.println(stringList);
		
		//System.out.print(stringList.get(4));
		System.out.println(otherList);
		
		//SETS
		Set<Double> mySet = new HashSet<>();
		mySet.add(100.0);
		mySet.add(200.0);
		//System.out.println(mySet);
		for (Double num: mySet) {
			System.out.println(num);
			/*if (num == mynum){
			 * sysout(num);
			 */
		}
		Set<Double> myTreeSet = new TreeSet<>();
		myTreeSet.addAll(mySet);
		mySet.add(null);
		Set<String> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add("Dragonfruit");
		myLinkedSet.add("Watermelon");
		//System.out.println(mySet);
		//System.out.println(myTreeSet);
		
		//QUEUE
		Queue <String> myQueue = new LinkedList<>();
		//LinkedList is capable of satisfying a queue as long as a list
		myQueue.add("Mercury"); //.add is part of the collections class
		myQueue.add("Venus");
		myQueue.add("Earth"); //Queue follows First in first out, or LILO
		
		System.out.println(myQueue);
		//.poll will give you the head of the queue
		//.peek doesn't remove the first element
		//use these to check the head of the queue.
		//.removeElement and .addElement (I think)
		
		Queue<String> myDequeQueue = new ArrayDeque<>();
		myDequeQueue.add("Mars");
		myDequeQueue.add("Neptune");
		myDequeQueue.add("Saturn");
		
		for(String s: myDequeQueue) {//the actual structure is being modified as we go through
			myDequeQueue.poll();
			System.out.println(s);
		}
		for(String s: myQueue) {
			//myQueue.poll();
			System.out.println(s);
		}
		
		Queue<String> myPriority = new PriorityQueue<>();
		
		myPriority.addAll(myQueue);
		myPriority.addAll(myDequeQueue);
		myPriority.addAll(myLinkedSet);
		
		System.out.println(myPriority);
		
		
	}
}
