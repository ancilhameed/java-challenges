
package com.learn.java.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class FindAnagramUsingAsci {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String firstWord = scanner.next();
		String secondWord = scanner.next();
		scanner.close();
		
		System.out.println("Is "+firstWord +" and "+ secondWord +" an anagram :: "+isAnagram(firstWord, secondWord));
		

	}

	private static boolean isAnagram(String firstWord, String secondWord) {
		
		if(firstWord.length() != secondWord.length()) {
			return false;
		}
		
		
		char[] firstArray = firstWord.toLowerCase().toCharArray();
		char[] secondArray = secondWord.toLowerCase().toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		System.out.println(firstArray);
		System.out.println(secondArray);
		
		
		
		return Arrays.equals(firstArray, secondArray);
	}
	
}
