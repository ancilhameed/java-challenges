/**
 * 
 */
package com.learn.java.design.pattern.singleton;


/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 10:38:40 pm
 */

/*
 * 
 * Why do we need Thread Safe Double Check Singleton ?
 * 
 * Let’s say two threads(T1 and T2) checked for null and both reached at
 * synchronized (Singleton.class). T1 gets the lock and create instance of
 * Singleton and return. Now T2 enters in a synchronized block, as we have
 * checked for null again, it will not create object again.
 */
public class ThreadSafeSingletonDoubleCheck {
	 
    private static volatile ThreadSafeSingletonDoubleCheck instance;
 
	/*
	 * By using Reflection the Constructor can be set to Visible and this will
	 * destroy our Singleton Pattern, hence we need to check if our INSTANCE Is not
	 * null
	 */    private ThreadSafeSingletonDoubleCheck()
    {
		 // private constructor
	        if(instance !=null)
	        {
	            throw new RuntimeException("You can not create object of singleton class twice");
	        }    }
 
    public static ThreadSafeSingletonDoubleCheck getInstance()
    {
        if(instance==null)
        {
            synchronized (ThreadSafeSingletonDoubleCheck.class) {
                if(instance==null)
                {   
                    instance= new ThreadSafeSingletonDoubleCheck();
                }
            }
 
        }
        return instance;
    }
}
