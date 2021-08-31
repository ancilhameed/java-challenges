
package com.learn.java.puzzles;

import java.util.Scanner;

public class TrailingZeroProblem {

	/**
	 * Below is a recursive method for calculating factorial of a given number.
	 * 
	 * @param input Input for finding factorial
	 * @return long Factorial fo a given number
	 * 
	 * @author ancil.hameed
	 */
	public static long findFactorial(long input) {
		if (input >= 1) {
			return input * findFactorial(input - 1);
		} else {
			return 1;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long input = scanner.nextInt();

		long factorial = findFactorial(input);

		StringBuilder sb = new StringBuilder(String.valueOf(factorial));
		sb.reverse();

		Integer i = new Integer(sb.toString());
		sb = new StringBuilder(String.valueOf(i));
		sb.reverse();

		if (input <= 6) {
			System.out.println(sb);
		} else {
			System.out.println(sb.substring(sb.length() - 3, sb.length()));
		}
		scanner.close();
	}

}
