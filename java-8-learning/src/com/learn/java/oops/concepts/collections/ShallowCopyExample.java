package com.learn.java.oops.concepts.collections;

import java.util.ArrayList;

public class ShallowCopyExample {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("US");
		list.add("China");
		System.out.println("Printing List 1 :: " + list);
		
		ArrayList<String> list2 = new ArrayList<>();
		System.out.println("Deep Copy -> Create list 2 with addAll() method by paasing List 1 :: " + list2);

		list2.addAll(list);
		System.out.println("Printing List 2 :: " + list2);
		list2.set(1, "Russia");
		System.out.println("Printing List 2, after replacing Element in List 2 :: " + list2);
		System.out.println("Printing List 1, after replacing Element in List 2 :: " + list);

	}

}
