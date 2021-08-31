package com.learn.java.puzzles;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	// Scanner for user input
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.println("Frequency of A :: "+Collections.frequency(Arrays.asList("a","a","b","a"), "a"));
		
		
		int noOfTestCases = scanner.nextInt();

		for (int j = 0; j < noOfTestCases; j++) {

			// How many words to consume
			int noOfWords = scanner.nextInt();

			// Collection to store unique values, based on equals and hashcode
			Set<String> uniqueWords = new HashSet<>();

			for (int i = 0; i < noOfWords; i++) {

				uniqueWords.add(scanner.next());

			}

			System.out.println(uniqueWords.size());

		}
		scanner.close();

	}

}
