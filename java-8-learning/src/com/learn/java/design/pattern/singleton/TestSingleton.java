/**
 * 
 */
package com.learn.java.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author Ancil Hameed
 * 
 *         Added : 05-Sep-2021, 10:50:57 pm
 */
public class TestSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = BillPughSingleton.getInstance();

		System.out.println("Hashcode of BillPughSingleton instance 1:: " + instance1.hashCode() + " ---  "
				+ "Hashcode of BillPughSingleton instance 2:: " + instance2.hashCode());

		try {
			Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (BillPughSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hashcode of instance1: " + instance1.hashCode());
		System.out.println("Hashcode of instance2: " + instance2.hashCode());

		// Breaking Singleton with Serialization
		BillPughSingleton instance1ForSerialization = BillPughSingleton.getInstance();
		// Serialize the object
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();

		// deserialize the object
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		BillPughSingleton instance2ForSerialization = (BillPughSingleton) in.readObject();
		in.close();

		System.out.println("Hashcode of instance1: " + instance1.hashCode());
		System.out.println("Hashcode of instance2: " + instance2.hashCode());
	}
}
