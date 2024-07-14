package com.examples;
public class Person {
	String name;
	int age;
	//Default constructor
	public Person() {
		this.name = "unknown";
		this.age = 0;
	}
	//Parameterized constructor
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	//Copy constructor
	public Person(Person other){
		this.name = other.name;
		this.age = other.age;
		
	}
	public void display() {
		System.out.println("Name: "  + name + ", age: " + age);
	}

}
