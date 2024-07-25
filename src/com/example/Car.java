package com.example;
public class Car implements Vehicle {
	public void start() {
		System.out.println("Car starting...");
		
	}
	public void brake() {
		System.out.println("Pushing brake...");
	}
	public void stop() {
		System.out.println("Car stoping...");
	}

}
