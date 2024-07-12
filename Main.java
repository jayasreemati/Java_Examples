
package com.main;

import com.examples.LargestNumberFinder;

import com.examples.EvenOrOdd;
import com.examples.Factorial;
import com.examples.MultiplicationTable;
import com.examples.NaturalNumbers;
import com.examples.Student;
import com.examples.Animal;
import com.examples.Dog;
import com.examples.Car;


import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		EvenOrOdd
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		EvenOrOdd checker = new EvenOrOdd();
		String result = checker.checkEvenOdd(number);

		System.out.println(result);

		//LargestOfThree
		
		System.out.println("Enter the first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double secondNumber = scanner.nextDouble();
		System.out.println("Enter the third number: ");
		double thirdNumber = scanner.nextDouble();

		LargestNumberFinder finder = new LargestNumberFinder();
		double largest = finder.findLargest(firstNumber, secondNumber, thirdNumber);

		System.out.println("The largest of three is " + largest);
		
        //Factorial
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		Factorial calculator = new Factorial();
		long factorial = calculator.calculateFactorial(num);

		System.out.println("The factorial of " + num + " is " + factorial);
		
		//MultiplicationTable
		
		System.out.print("Enter a number: ");
		int numberr = scanner.nextInt();
		        
		MultiplicationTable table = new MultiplicationTable();
		table.printTable(numberr);
		
		//NaturalNumbers
		System.out.println("Enter a number ");
		int n = scanner.nextInt();
		NaturalNumbers printer= new NaturalNumbers();
		printer.printNatural(n);
		scanner.close();
		
		
		//Constructor
		Car car1 = new Car("BMW");
		Car car2 = new Car("Fortuner");
		System.out.print("Car1 brand is " + car1.getBrand());
		System.out.print("Car2 brand is " + car2.getBrand());
		
		
		
		//Method Overloading
		Student student1 =  new Student();
		student1.setDetails ("Alice") ;
		student1.displayDetails();
		
		
		Student student2 =  new Student();
		student2.setDetails ("Jaya",20) ;
		student2.displayDetails();
		
		
		Student student3 =  new Student();
		student3.setDetails ("Raj",21,"S123") ;
		student3.displayDetails();
		
		
		Student student4 =  new Student();
		student4.setDetails ("Bob",22,"S124","Computer science") ;
		student4.displayDetails();
		
		
		//Method overriding
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		myAnimal.makeSound();
		myAnimal.eat();
		myDog.makeSound();
		myDog.eat();
		
		
		}
		


		
	}


