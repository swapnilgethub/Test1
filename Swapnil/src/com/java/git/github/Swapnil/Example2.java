package com.java.git.github.Swapnil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		HashMap hm =new HashMap();
		
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		hm.put(104, "D");
		hm.put(105, "E");
		
		
		Set set = hm.keySet();
		
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			
		Object key =itr.next();		
		System.out.println("Key is: " +key);
		System.out.println("Value is: " +hm.get(key));
		}

	}

}
