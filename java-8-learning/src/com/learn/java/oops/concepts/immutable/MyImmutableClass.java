/**
 * 
 */
package com.learn.java.oops.concepts.immutable;

import java.util.ArrayList;

/**
 * @author Ancil Hameed
 * 
 *         05-Sep-2021, 10:04:00 pm
 */

/*
 * Steps to create an Immutable Object
 * 
 * Make your class final : If you make your class final, no class will be able
 * to extend it, hence will not be able override methods of this class. Declare
 * all instance variable with private and final : If you make instance variable
 * private, no outside class will be able to access instance variables and if
 * you make them final, you can not change it. Say no to setter methods : Don’t
 * create setter method for any instance variables, hence there will be no
 * explicit way to change state of instance variables. Initialize all variables
 * in constructor : You can initialize variables in constructor. You need to
 * take special care while working with mutable object. You need to do deep copy
 * in case of imutable objects. Perform cloning of mutable objects while
 * returning from getter method: If you return clone of object from getter
 * method, it won’t return original object, so your original object will remain
 * intact.
 */
public final class MyImmutableClass {
    // declared private final instance variable
 private final String countryName;
 // Mutable object
 private final ArrayList listOfStates;
 
 public MyImmutableClass(String countryName, ArrayList listOfStates) {
  super();
  this.countryName = countryName;
  // Creating deep copy for mutable object
  ArrayList tempList = new ArrayList();
 
  for (int i = 0; i < listOfStates.size(); i++) {
   tempList.add(listOfStates.get(i));
  }
  this.listOfStates = tempList;
 }
 
 public String getCountryName() {
     // Do not need to do cloning as it is immutable object
  return countryName;
 }
 
 public ArrayList getListOfStates() {
     // Returning cloned object 
  return (ArrayList) listOfStates.clone();
 }
 
 public static void main(String args[]) {
  ArrayList listOfStates = new ArrayList();
  listOfStates.add("Madhya Pradesh");
  listOfStates.add("Maharastra");
  listOfStates.add("Gujrat");
  String countryName="India";
  
  MyImmutableClass country = new MyImmutableClass(countryName, listOfStates);
  System.out.println("Country : " + country.getCountryName());
  // Lets try to change local variable countryName
  countryName="China";
  System.out.println("Updated Country Name : " + country.getCountryName());
  System.out.println("List of states : " + country.getListOfStates());
  // It will  not be added to the list because we are using clone in
  // getListOfStates
  System.out.println("Adding element to Immutabe objects, mutable Array List : ");

  country.getListOfStates().add("Kerala");
  // It will not be added to the list because we are using deep copy in
  // constructor
  listOfStates.add("Rajasthan");
  System.out.println("Updated List of states : " + country.getListOfStates());
 
 }
 
}