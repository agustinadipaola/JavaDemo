package garage.runner;

import garage.data.Bicycle;
import garage.data.Car;
import garage.data.Tricycle;

public class App {
	public static void main(String[] args) {
		Car auto = new Car("Fiat", 125, "Red");
		auto.print();
		
		Car auto2 = new Car("Ford", 2022, "Blue");
		auto2.print();

		Bicycle bici = new Bicycle("Trek", 2020, "Blue");
		bici.print();
		
		Bicycle bici2 = new Bicycle("Avon Cycles", 2021, "Black");
		bici2.print();

		Tricycle trici = new Tricycle("Kent", 2023, "Pink");
		trici.print();
		
		Tricycle trici2 = new Tricycle("York", 2024, "Light-Blue");
		trici2.print();
	}
}
