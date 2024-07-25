package com.example;

public class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike starting...");
	}
	public void brake() {
		System.out.println("Applying brake...");
	}
	public void stop() {
		System.out.println("Bike stoping...");
	}

}
