package com.motivity.collection;

import java.util.HashSet;

public class TreesetPractice {

	
	public static void main(String[] args)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//add method is used to add the elements into the set
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		hs.add(16);
		hs.add(null);
		hs.add(30);
		System.out.println(hs);
		System.out.println("added by using add() method.....");
		System.out.println("=================================");
		HashSet<Integer> hs1 =new HashSet<Integer>();
		hs1.add(32);
		hs1.add(78);
		System.out.println("");
		//clone method is used to copy or shadow of an anothe set object
		 hs1 =(HashSet<Integer>) hs.clone();
		System.out.println(hs1);
		System.out.println("cloned to h1 object into h2 object...");
		System.out.println("=================================");
		//Remove an element
		hs1.remove(15);
		System.out.println("after remove an element 15 by using remove() method ");
		System.out.println(hs1);
		
		

	}

}
