package com.learn.java.puzzles;

import java.util.Optional;

public class OptionalDemo {

	
	public static Optional<String> changeCase(String s){
		if(s != null && s.startsWith("A")) {
			return Optional.of(s.toUpperCase());
		}else{
			//some String can be NULL
			return Optional.ofNullable(s);
		}
	}
	public static void main(String[] args) {
		System.out.println(changeCase(null));
		System.out.println(changeCase("Ancil").get());
	}
}
