package list;

import garage.data.Bicycle;
import garage.data.Car;
import garage.data.Tricycle;

public class App {

	public static void main(String[] args) {

		Garage myGarage = new Garage("Battersea Dogs Home");

		myGarage.park(new Car("Audi", 2023, "Black", false));
		myGarage.park(new Bicycle("Trek", 2019, "Purple", 27));
		myGarage.park(new Tricycle());

		myGarage.collect(new Car("Audi", 2023, "Black", false));

		myGarage.print();

	}

}