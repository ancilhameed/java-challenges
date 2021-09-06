package com.learn.java.oops.concepts.collections;

public class Employee implements Comparable<Employee> {

	private String name;
	
	private int id;
	
	

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(employee.getName());
	}
	
	
	
}
