package com.learn.java.design.pattern.singleton;

public class SingletonDoubleLockingExmple implements Cloneable{

	static volatile SingletonDoubleLockingExmple _instance;
	
	public static SingletonDoubleLockingExmple getInstance()
	{ 
		/*
		 * Let’s say two threads(T1 and T2) checked for null and both reached at
		 * synchronized (Singleton.class). T1 gets the lock and create instance of
		 * Singleton and return. Now T2 enters in a synchronized block, as we have
		 * checked for null again, it will not create object again.
		 */
		
	    if (_instance == null) { // Single Checked 
	        synchronized (SingletonDoubleLockingExmple.class) 
	        { 
	            if (_instance == null)// Double checked 

	            { 
	                _instance = new SingletonDoubleLockingExmple(); 
	            }
	        } 
	    } return _instance; 
	}
	
}


