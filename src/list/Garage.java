package list;

import java.util.ArrayList;

import garage.data.Vehicle;

public class Garage {

	private String name;

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage(String name) {
		super();
		this.name = name;
	}

	public void park(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void collect(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}
}