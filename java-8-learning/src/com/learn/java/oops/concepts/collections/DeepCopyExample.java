package com.learn.java.oops.concepts.collections;

import java.util.ArrayList;
import java.util.Date;

public class DeepCopyExample {

	  public static void main(String[] args) {
	        System.out.println(" ### Deep Copy of Custom Object in ArrayList List----->  ");

		  
	        ArrayList<Student> studentList = new ArrayList<>();
	        studentList.add(new Student("Rohan","102",new Date(2002, 02, 12)));
	        studentList.add(new Student("David","105",new Date(1999, 05, 30)));
	 
	        System.out.println(" ### Original List----->  ");
	        studentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));

	        
	        ArrayList<Student> clonedStudentList = (ArrayList<Student>) studentList.clone();
	        System.out.println(" ### Cloned List----->  ");
	        clonedStudentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));

	        // Update cloned list
	        clonedStudentList.get(0).setName("John");
	        System.out.println(" ### Cloned List, after updating element in Cloned List----->  ");
	        clonedStudentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));

	        
	        System.out.println(" ### Original List, after updating element in Cloned List----->  ");
	        studentList.forEach(e->System.out.println(e.getName()+" "+e.getId()));

	    }
}


class Student implements Cloneable{
    String name;
    String id;
    Date dateOfBirth;
 
    public Student(String name, String id,Date dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth=dateOfBirth;
    }
 
    @Override
    public Student clone() {
        Student clonedStudent = null;
        try {
            clonedStudent = (Student) super.clone();
            clonedStudent.setDateOfBirth((Date)this.dateOfBirth.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        return clonedStudent;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
 