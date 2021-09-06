package com.learn.java.oops.concepts.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ancil Hameed", 1);
		Employee e2 = new Employee("Shivam Kumar", 2);
		Employee e3 = new Employee("Pritvish Mandal", 3);
		Employee e4 = new Employee("Abhishek Kumar", 1);
		Employee e5 = new Employee("Arpit Singh", 5);
		TreeSet<Employee> employees = new TreeSet() {
			{
				add(e1);
				add(e2);
				add(e3);
				add(e4);
				add(e5);
			}
		};

		System.out.println(employees);
	}
}
