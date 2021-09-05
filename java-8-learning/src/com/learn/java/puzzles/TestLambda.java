package com.learn.java.puzzles;

public class TestLambda {

	interface Lamda2{
		public String demo(String s);
	}
	
	public static void main(String[] args) {
		
		LamdaDemo demo = () -> { return "Hello World!";};
		System.out.println(demo.demo());
		
		Lamda2 lamda2 = s -> s.toUpperCase();
		
		System.out.println(lamda2.demo("Hello World!"));
	}
}
