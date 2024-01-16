package oop;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();
		moggy.setName("Paco");
		moggy.setBreed("Russian");
		moggy.setAge(4);
		moggy.setColour("Black");

		moggy.print();
		Cat moggy2 = new Cat();
		moggy2.setName("Mimi");
		moggy2.setAge(125);
		moggy2.setColour("Grey");

		moggy2.print();
		moggy2.sleep();

		Cat[] cats = { moggy, moggy2 };

		// for each cat of cats
		for (Cat cat : cats) {
			cat.print();
			cat.getAge();
		}
		moggy.setAge(moggy.getAge() + 1);
	}

}