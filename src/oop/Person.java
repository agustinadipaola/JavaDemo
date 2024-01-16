package oop;

//1. Create a Person class

public class Person {
	// 2. Give it at least 3 fields

	String name;
	String lastName;
	int age;
	String motherLenguage;

	// 6. Call that method in main

	void print() {
		System.out.println("My full name is: " + name + " " + lastName);
		System.out.println("I am " + age + " years old");
		System.out.println("I speak: " + motherLenguage);

	}
}
