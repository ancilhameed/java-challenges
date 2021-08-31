
package com.learn.java.puzzles;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> bookAndPrice = new HashMap<>();

		bookAndPrice.put("Effective Java", 42);
		bookAndPrice.put("Head First Java", 29);
		bookAndPrice.put("Java Concurrency in Practice", 33);
		bookAndPrice.put("Head First Design Patterns", 41);

		System.out.println("before removing : " + bookAndPrice);

		Iterator<String> iterator = bookAndPrice.keySet().iterator();
		while (iterator.hasNext()) {
			//if (iterator.next().contains("Java")) {
				iterator.remove();
				bookAndPrice.remove(iterator.next());
			//}
		}

		System.out.println("after removing : " + bookAndPrice);

	}

}
