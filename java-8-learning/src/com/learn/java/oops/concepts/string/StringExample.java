package com.learn.java.oops.concepts.string;

public class StringExample {

	
	public static void main(String[] args) {
		String s1 = "hello";

		String s2 = new String("hello");
		
		System.out.println("S1 hashcode :: "+s1.hashCode());
		
		System.out.println("S2 hashcode :: "+s2.hashCode());

		
		System.out.println("Is S1 and S2 .equals() :: "+s1.equals(s2));
		
		System.out.println("Is S1 and S2 (==) :: "+s1 == s2);


	}
}
