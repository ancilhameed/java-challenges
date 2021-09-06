/**
 * 
 */
package com.learn.java.design.pattern.singleton;

/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 11:49:58 pm
 */
public class SingletonEnumTest {
	 public static void main(String[] args) {
	        SingletonEnum singleton = SingletonEnum.INSTANCE;

	        System.out.println(singleton.getValue());
	        singleton.setValue(2);
	        System.out.println(singleton.getValue());
	    }
}
