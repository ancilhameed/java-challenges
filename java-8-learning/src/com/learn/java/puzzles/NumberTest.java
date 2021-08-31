
package com.learn.java.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberTest {

	
	private static long findBloodCount(String claimant, Map<String, String[]> childAndParentsMap,
			Map<String, Long> bloodMap) {

		if (bloodMap.get(claimant) != null) {
			return bloodMap.get(claimant);
		}

		if (childAndParentsMap.get(claimant) == null) {
			return 0;
		}

		String[] parents = childAndParentsMap.get(claimant);

		
		long bloodCount = (findBloodCount(parents[0], childAndParentsMap, bloodMap)
				+ findBloodCount(parents[1], childAndParentsMap, bloodMap)) / 2;

		bloodMap.put(claimant, bloodCount);
		return bloodCount;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfParentsChild = scanner.nextInt(), numberOfClaimants = scanner.nextInt();

		Map<String, Long> bloodMap = new HashMap<String, Long>();
		bloodMap.put(scanner.next(), 10000L);

		Map<String, String[]> childAndParentsMap = new HashMap<String, String[]>();

		for (int i = 0; i < numberOfParentsChild; i++) {
			childAndParentsMap.put(scanner.next(), new String[] { scanner.next(), scanner.next() });
		}

		int maxBloodCount = 0;
		String mostWorthyChild = "";
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
