package com.java.main;

import java.util.Hashtable;

public class MyHashtable {
	
	public static void main(String str []) {
		
		//Creating Hashtable thread-safe collection
		Hashtable<Integer, String> myHashtable = new Hashtable<>();
		
		//Checking how many elements contains myHashtable
		System.out.println("MyHashtable has " + myHashtable.size() + " elements");
		
		//Adding elements to Hashtable
		myHashtable.put(1, "Stephan");
		myHashtable.put(2, "Arne");
		myHashtable.put(3, "Christian");
		myHashtable.put(4, "Ralf");
		myHashtable.put(5, "Theo");
		myHashtable.put(6, "Matias");
		myHashtable.put(7, "Angela");
		myHashtable.put(8, "Laura");
		myHashtable.put(9, "Harry");
		myHashtable.put(10, "Sophia");
		myHashtable.put(11, "Monica");
		myHashtable.put(12, "Linda");
		
		//Checking how many elements contains myHashtable
		System.out.println("MyHashtable has " + myHashtable.size() + " elements");
		
		//Printing myHastable to console
		System.out.println("Hashtable contains " + myHashtable);
		
		//Checking if myHashtable has element with value Sophia and printing to console
		if(myHashtable.contains("Sophia")) {
			System.out.println("yes"); 
		} else {
			System.out.println("no");
		}
		
		//Printing to console element with key 10
		System.out.println(myHashtable.get(10));
		
		//Printing to console element with key 12
		System.out.println(myHashtable.get(12));
		
		//Printing to console element with key 1
		System.out.println(myHashtable.get(1));
		
		//Printing to console element with key 2
		System.out.println(myHashtable.get(2));
		
		//Checking if myHashtable empty or not
		System.out.println("Is myHashtable empty:" + myHashtable.isEmpty());
		
		//Replacing elemnt number 5 with value Ronald
		myHashtable.replace(5, "Ronald");
		
		//Printing myHastable to console
		System.out.println("Hashtable contains " + myHashtable);
		
		//Removing element with key value 8 from myHashtable
		myHashtable.remove(8);
		
		//Printing myHastable to console
		System.out.println("Hashtable contains " + myHashtable);
		
		//Checking how many elements contains myHashtable
		System.out.println("MyHashtable has " + myHashtable.size() + " elements");
		
	}

}
