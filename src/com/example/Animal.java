package com.example;
//super class
public class Animal{
	
	private String species;
	private int age;
	public Animal() {
		
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String species,int age) {
		this.species = species;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("Species: " + species);
		System.out.println("Age    : " + age);
	}

}
