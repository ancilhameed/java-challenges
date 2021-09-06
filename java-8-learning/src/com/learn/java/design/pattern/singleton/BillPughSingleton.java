/**
 * 
 */
package com.learn.java.design.pattern.singleton;

import java.io.Serializable;

/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 10:49:22 pm
 */
 
public class BillPughSingleton implements Serializable, Cloneable{
 
    private BillPughSingleton()
    {
        // private constructor
        if(SingletonHelper.INSTANCE!=null)
        {
            throw new RuntimeException("You can not create object of singleton class twice");
        }
    }
 
     private static class SingletonHelper{
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }
 
        public static BillPughSingleton getInstance(){
            return SingletonHelper.INSTANCE;
        }
 
        protected Object readResolve() {
            return getInstance();
        }
        
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            return new CloneNotSupportedException("You can not clone object of Singleton class ");
        }
}