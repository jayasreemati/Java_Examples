package com.examples;
public class Student {
	private String name;
	private int age;
	private String id;
	private String major;
    public void setDetails(String name) {
    	this.name = name;
    }
    public void setDetails(String name,int age) {
    	this.name = name;
    	this.age  = age; 
    }
    public void setDetails(String name,int age,String id) {
    	this.name = name;
    	this.age = age;
    	this.id = id;
    }
    public void setDetails(String name,int age,String id,String major) {
    	this.name = name;
    	this.age = age;
    	this.id = id;
    	this.major = major;
    }
    public void displayDetails() {
    	System.out.println("Name : " + name );
    
    if (age != 0) {
    	System.out.println("Age  : " + age);
    }
    if (id != null) {
    	System.out.println("Id   : " + id);
    }
    if (major != null) {
    	System.out.println("major: " + major);
    }
}
}
   

