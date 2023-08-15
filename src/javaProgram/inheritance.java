package javaProgram;

import java.util.Scanner;

import java.util.Scanner;


	class Animal {
	    String name;
	    int age;

	    Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void eat() {
	        System.out.println(name + " is eating.");
	    }

	    void sleep() {
	        System.out.println(name + " is sleeping.");
	    }
	}

	// Child class inheriting from Animal
	class Dog extends Animal {
	    Dog(String name, int age) {
	        super(name, age);
	    }

	    void bark() {
	        System.out.println(name + " is barking.");
	    }
	}

	public class inheritance {
	    public static void main(String[] args) {
	        // Create an instance of Dog
	        Dog dog = new Dog("Buddy", 5);

	        // Access the inherited methods from Animal class
	        dog.eat(); // Output: Buddy is eating.
	        dog.sleep(); // Output: Buddy is sleeping.

	        // Call the method specific to Dog class
	        dog.bark(); // Output: Buddy is barking.
	    }
	}

	  
