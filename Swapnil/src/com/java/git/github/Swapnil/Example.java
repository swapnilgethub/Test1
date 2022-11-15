package com.java.git.github.Swapnil;

import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("swapnil");
		hs.add("Rutuja");
		hs.add("Tanuja");
		hs.add("Ajay");
		hs.add("Saurabh");
		
		Iterator itr =hs.iterator();
		while(itr.hasNext()) 
		{
		
				System.out.println(itr.next());
				
		}

	}

}
