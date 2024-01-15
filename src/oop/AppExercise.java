package oop;

//3. In a SEPERATE file instantiate (create) a couple person object

public class AppExercise {
	public static void main(String[] args) {
		Person indiv = new Person();
		// 4. Give them some data

		indiv.name = "Tadas";
		indiv.lastName = "Kucinskas";
		indiv.age = 30;
		indiv.motherLenguage = "Lithuanian";
		// 5. Give your person a method that introduces themselves

		System.out.println("My full name is: " + indiv.name + " " + indiv.lastName);
		System.out.println("I am " + indiv.age + " years old");
		System.out.println("I speak: " + indiv.motherLenguage);

		// 6. Call that method in main
		indiv.print();

		Person indiv2 = new Person();
		indiv2.name = "Bianca";
		indiv2.lastName = "Tevez";
		indiv2.age = 28;
		indiv2.motherLenguage = "Spanish";

		System.out.println("My full name is: " + indiv2.name + " " + indiv2.lastName);
		System.out.println("I am " + indiv2.age + " years old");
		System.out.println("I speak: " + indiv2.motherLenguage);

		// 6. Call that method in main
		indiv2.print();

		Person indiv3 = new Person();

		indiv3.name = "Elena";
		indiv3.lastName = "Zuppone";
		indiv3.age = 33;
		indiv3.motherLenguage = "Italian";

		// 6. Call that method in main
		indiv3.print();

		System.out.println("My full name is: " + indiv3.name + " " + indiv3.lastName);
		System.out.println("I am " + indiv3.age + " years old");
		System.out.println("I speak: " + indiv3.motherLenguage);

	}

}


//1. Create a Person class
//2. Give it at least 3 fields
//3. In a SEPERATE file instantiate (create) a couple person object
//4. Give them some data
//5. Give your person a method that introduces themselves
//6. Call that method in main
