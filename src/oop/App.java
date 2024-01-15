package oop;

public class App {
	public static void main (String [] args) {
	Cat	moggy = new Cat ();
	
	moggy.name= "PACO";
	moggy.breed= "Russian Black";
	moggy.age= 4;
	moggy.colour= "Black";
	
	System.out.println(moggy.name);
	System.out.println(moggy.breed);
	System.out.println(moggy.age);
	System.out.println(moggy.colour);
	moggy.print ();
	moggy.sleep ();
	Cat moggy2 = new Cat ();
	
	moggy2.name= "MIMI";
	moggy2.breed= "Siamese";
	moggy2.age= 17;
	moggy2.colour= "Grey";
	
	System.out.println(moggy2.name);
	System.out.println(moggy2.breed);
	System.out.println(moggy2.age);
	System.out.println(moggy2.colour);
	moggy2.print ();
	moggy2.sleep ();
	
//	for each cat of cats
	Cat [] cats = {moggy, moggy2};
	for ( Cat cat : cats) {
	cat.print();
	}

	}

}
