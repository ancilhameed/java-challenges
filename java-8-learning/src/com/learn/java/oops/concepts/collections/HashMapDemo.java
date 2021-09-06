package com.learn.java.oops.concepts.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String args[]) {

		System.out.println("HashMap Demo 1: Check String with literal and with New Keyword in HashMap");
		HashMap<String, String> map1 = new HashMap<String, String>();
		String s1 = "hello";
		String s2 = new String("hello");
		map1.put(s1, "s1");
		map1.put(s2, "s2");
		System.out.println("Map size after putting 2 same String : "+map1.size());

		// HashMap with Country as key and capital as value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("France", "Paris");
		map.put("Russia", "Moscow");

		// Iterating java iterator
		System.out.println(
				"HashMap Demo 2: Concurrent modification exception, because Iterator checks for modCount and initial count when we call iterator.next ");
		Iterator<String> countryKeySetIterator = map.keySet().iterator();
		while (countryKeySetIterator.hasNext()) {
			String countryKey = countryKeySetIterator.next();
			map.put("Nepal", "KathMandu");
			System.out.println(countryKey);

			/*
			 * You will get below output Iterating java IteratorException in thread “main”
			 * java.util.ConcurrentModificationException
			 * 
			 * Whenever you try to change count of Hashmap while iterating, it will throw
			 * java.util.ConcurrentModificationException because we call iterator.next, it
			 * checks for modCount and initial count, if it does not match it will throw
			 * ConcurrentModificationException.
			 */

		}
		System.out.println("-----------------------------");
	}

}
