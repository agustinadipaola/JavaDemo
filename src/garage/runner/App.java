package garage.runner;

import garage.data.Bicycle;
import garage.data.Car;
import garage.data.Tricycle;
import garage.data.Vehicle;

public class App {

	public static void main(String[] args) {
		Car auto = new Car("Fiat", 125, "Red", true);
//		auto.print();
		Car auto2 = new Car("Ford", 2022, "Blue", false);
//		auto2.print();
		Bicycle bici = new Bicycle("Trek", 2020, "Blue", 25);
//		bici.print();
		Bicycle bici2 = new Bicycle("Avon Cycles", 2021, "Black", 27);
//		bici2.print();
		Tricycle trici = new Tricycle("Kent", 2023, "Pink", false);
//		trici.print();
		Tricycle trici2 = new Tricycle("York", 2024, "Light-Blue", true);
//		trici2.print();

		Vehicle v = new Car("Chevrolet", 1998, "Black", true);
		Vehicle v2 = new Bicycle("Trek", 2024, "Pink", 29);
		Vehicle v3 = new Tricycle("York", 2024, "Red", false);

		Vehicle[] vehicles = { v, v2, v3 };

		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}

	}
}
