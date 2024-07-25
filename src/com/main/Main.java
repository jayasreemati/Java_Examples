
package com.main;

//import com.examples.LargestNumberFinder;
//import com.examples.Vehicle;
//import com.examples.StaticExample;
//import com.examples.StudentExample;
//import com.examples.Counter;
//import com.examples.Car;


//import com.examples.EvenOrOdd;
//import com.examples.Factorial;
//import com.examples.MultiplicationTable;
//import com.examples.NaturalNumbers;
//import com.examples.Student;
//import com.examples.Animal;
//import com.examples.Dog;
//import com.examples.Car;
//import com.examples.Cat;
//import com.examples.Person;
import com.examples.Shape;
import com.examples.Student;
import com.examples.Rectangle;
import com.examples.Circle;
//import com.examples.Bike;
import com.examples.PersonInfo;
import com.examples.StudentExample;
import com.example.Vehicle;
import com.example.Car;
import com.example.Bike;
import com.example.Animal;
import com.example.Dog;

//import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
//		//EvenOrOdd
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int number = scanner.nextInt();
//		EvenOrOdd checker = new EvenOrOdd();
//		String result = checker.checkEvenOdd(number);
//
//		System.out.println(result);
//
//		//LargestOfThree
//		
//		System.out.println("Enter the first number: ");
//		double firstNumber = scanner.nextDouble();
//		System.out.println("Enter the second number: ");
//		double secondNumber = scanner.nextDouble();
//		System.out.println("Enter the third number: ");
//		double thirdNumber = scanner.nextDouble();
//
//		LargestNumberFinder finder = new LargestNumberFinder();
//		double largest = finder.findLargest(firstNumber, secondNumber, thirdNumber);
//
//		System.out.println("The largest of three is " + largest);
//		
//        //Factorial
//		System.out.print("Enter a number: ");
//		int num = scanner.nextInt();
//
//		Factorial calculator = new Factorial();
//		long factorial = calculator.calculateFactorial(num);
//
//		System.out.println("The factorial of " + num + " is " + factorial);
//		
//		//MultiplicationTable
//		
//		System.out.print("Enter a number: ");
//		int numberr = scanner.nextInt();
//		        
//		MultiplicationTable table = new MultiplicationTable();
//		table.printTable(numberr);
//		
//		//NaturalNumbers
//		System.out.println("Enter a number ");
//		int n = scanner.nextInt();
//		NaturalNumbers printer= new NaturalNumbers();
//		printer.printNatural(n);
//		scanner.close();
//		
//		
//		//Constructor
//		Car car1 = new Car("BMW");
//		Car car2 = new Car("Fortuner");
//		System.out.print("Car1 brand is " + car1.getBrand());
//		System.out.print("Car2 brand is " + car2.getBrand());
//		
//		
//		
//		//Method Overloading
//		Student student1 =  new Student();
//		student1.setDetails ("Alice") ;
//		student1.displayDetails();
//		
//		
//		Student student2 =  new Student();
//		student2.setDetails ("Jaya",20) ;
//		student2.displayDetails();
//		
//		
//		Student student3 =  new Student();
//		student3.setDetails ("Raj",21,"S123") ;
//		student3.displayDetails();
//		
//		
//		Student student4 =  new Student();
//		student4.setDetails ("Bob",22,"S124","Computer science") ;
//		student4.displayDetails();
//		
//		
//		//Method overriding
//		Animal myAnimal = new Animal();
//		Animal myDog = new Dog();
//		Animal myCat =  new Cat();
//		myAnimal.makeSound();
//		myAnimal.eat();
//		myDog.makeSound();
//		myDog.eat();
//		myCat.makeSound();
//		myCat.eat();
//		
//		
//		//Constructors
//		Person person1 = new Person();
//		person1.display();
//		Person person2 = new Person("Alice", 30);
//		person2.display();
//		Person person3 = new Person(person2);
//		person3.display();
// 		
//		}
//	
//	    //Interface
	    Shape circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea()) ;
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter()) ;

        // Create a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
//	
        
        //Vehicle example
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
        
        //Encapsulation
        PersonInfo person = new PersonInfo();
        person.setName("Jaya");
        person.setAge(22);
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        
//        //static keyword
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//        Counter c3 = new Counter();
//        System.out.println("Number of instances created: " + c1.getCount());
//        //static example
//        StaticExample.staticMethod();
		
        //student example with static keyword
        StudentExample student1 = new StudentExample();
        student1.setName("kavya");
        student1.setStudentID("1230");
        student1.setEmail("Kavya@gmail.com");
        student1.setPhoneNumber("999 999 9999");
        student1.displayStudentInfo();
        System.out.println();
        StudentExample student2 = new StudentExample("Jaya","1234","jaya@gmail.com","123 456 7890");
        student2.displayStudentInfo();
        System.out.println();
        StudentExample student3 = new StudentExample("John","1235","john@gmail.com","098 765 4321");
        student3.displayStudentInfo();
        
        //Interface with vehicle example
        Vehicle car1 = new Car();
        Vehicle bike1 = new Bike();
        car.start();
        bike.start();
        car.brake();
        bike.brake();
        car.stop();
        bike.stop();
        
        //super keyword example
        Dog myDog = new Dog();
        myDog.setSpecies("canian");
        myDog.setAge(5);
        
        myDog.displayInfo();
        
        


		
	}
}


