/**
 * 
 */
package com.learn.java.design.pattern.strategy;

import java.util.List;

/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 11:20:36 pm
 */
public class QuickSortStrategy implements SortingStrategy{

	@Override
    public void sort(List list) {
        System.out.println("Sorting List using quick sort");
    }

}
