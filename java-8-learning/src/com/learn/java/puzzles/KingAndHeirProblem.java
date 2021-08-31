
package com.learn.java.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KingAndHeirProblem {

	/**
	 * Below method is a Recursive function which takes 3 parameter.
	 * 
	 * @param claimant Claimant for the throne
	 * @param childAndParentsMap Hashmap which contains the Child and Parents relationship
	 * @param bloodMap bloodMapHashmap for the blood count details
	 * 
	 * @return int blood count for the given claimant
	 * @author ancil.hameed
	 * */
	private static long findBloodCount(String claimant, Map<String, String[]> childAndParentsMap,
			Map<String, Long> bloodMap) {

		// If blood detail found then return
		if (bloodMap.containsKey(claimant)) {
			return bloodMap.get(claimant);
		}

		// If blood detail NOT found then default to Zero
		if (!childAndParentsMap.containsKey(claimant)) {
			return 0;
		}

		String[] parents = childAndParentsMap.get(claimant);

		// Child blood count is half of his parents combined blood,
		// For parent also recursively calling same function
		long bloodCount = (findBloodCount(parents[0], childAndParentsMap, bloodMap)
				+ findBloodCount(parents[1], childAndParentsMap, bloodMap)) / 2;
		bloodMap.put(claimant, bloodCount);
		System.out.println(bloodMap);
		return bloodCount;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfParentsChild = scanner.nextInt(), numberOfClaimants = scanner.nextInt();

		Map<String, Long> bloodMap = new HashMap<String, Long>();
		// Adding founder blood which is known
		bloodMap.put(scanner.next(), 10000L);

		Map<String, String[]> childAndParentsMap = new HashMap<String, String[]>();

		// Iterate through the parent & child loop
		for (int i = 0; i < numberOfParentsChild; i++) {
			// Here key is child name and String array is parents
			childAndParentsMap.put(scanner.next(), new String[] { scanner.next(), scanner.next() });
		}

		long maxBloodCount = 0;
		String mostWorthyChild = "";
		// Iterate through the claimants loop
		for (int i = 0; i < numberOfClaimants; i++) {
			String claimant = scanner.next();
			long bloodCount = findBloodCount(claimant, childAndParentsMap, bloodMap);
			if (bloodCount > maxBloodCount) {
				mostWorthyChild = claimant;
			}
		}
		System.out.println(mostWorthyChild);
		scanner.close();
	}

	
}
