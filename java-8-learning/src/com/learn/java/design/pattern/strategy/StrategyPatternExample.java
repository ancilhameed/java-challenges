/**
 * 
 */
package com.learn.java.design.pattern.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ancil Hameed
 * 
 *         Added : 05-Sep-2021, 11:11:26 pm
 */

/*
 * Strategy design pattern allows us to change algorithm implementation at
 * runtime. Strategy design pattern provides multiple algorithms and client can
 * choose algorithm based on their needs with the help of composition.
 */
public class StrategyPatternExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 44, 5, 3, 5, 5, 64, 3 });
		MergeSortStrategy mergeSortStrategy = new MergeSortStrategy();
		SortingManager sm = new SortingManager(list, mergeSortStrategy);
		sm.sortList();

		System.out.println();

		QuickSortStrategy quickSort = new QuickSortStrategy();
		sm.setSortingStrategy(quickSort);
		sm.sortList();

	}
}
