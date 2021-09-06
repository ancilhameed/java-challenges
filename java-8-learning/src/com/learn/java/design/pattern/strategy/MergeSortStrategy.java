/**
 * 
 */
package com.learn.java.design.pattern.strategy;

import java.util.List;

/**
 * @author Ancil Hameed
 * 
 *         Added : 05-Sep-2021, 11:19:43 pm
 */

public class MergeSortStrategy implements SortingStrategy {

	@Override
	public void sort(List list) {
		System.out.println("Sorting List using merge sort");
	}

	
}
