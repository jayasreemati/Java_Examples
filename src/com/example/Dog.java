package com.example;

public class Dog extends Animal{
	private String name; 
	public Dog() {
		
	}
	
	public Dog(String species,int age,String name) {
		super();
		this.name = name;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Name   : " + name);
	}

}
