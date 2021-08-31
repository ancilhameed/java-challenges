package com.learn.java.puzzles;

public class RecursiveFunction {

	public static void main(String[] args) {
		foo(4);
	}

	private static void foo(int i) {
		if(i < 1){
			return;
		}else {
			foo(i-1);
		}
		System.out.println("Hellow World!!!" +i);
	}
}
