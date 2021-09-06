/**
 * 
 */
package com.learn.java.design.pattern.strategy;

import java.util.List;

/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 11:14:58 pm
 */
public class SortingManager {
	SortingStrategy sortingStrategy;
    List<Integer> list;
 
    public SortingManager(List<Integer> list,SortingStrategy sortingStrategy) {
        super();
        this.list = list;
        this.sortingStrategy=sortingStrategy;
    }
 
    public void sortList()
    {
        System.out.println("===================================");
        System.out.println("Sorting List based on Type");
        System.out.println("===================================");
 
        sortingStrategy.sort(list);
    }
 
    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }
 
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
 
    public List<Integer> getList() {
        return list;
    }
 
    public void setList(List<Integer> list) {
        this.list = list;
    }
 
   
}