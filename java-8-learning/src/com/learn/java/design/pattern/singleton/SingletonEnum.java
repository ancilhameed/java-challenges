/**
 * 
 */
package com.learn.java.design.pattern.singleton;

/**
 * @author Ancil Hameed
 * 
 * Added : 05-Sep-2021, 11:49:40 pm
 */
public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
