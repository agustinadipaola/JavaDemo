package garage.data;

public class Car extends Vehicle {

//	default constructor
	public Car() {
		super();
	}

	public Car(String brand, int year, String colour, boolean auxwheel) {
		super(brand, year, colour);
		this.auxwheel = auxwheel;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Aux Wheel?: " + this.auxwheel);
	}

	private boolean auxwheel;

	public boolean isAuxwheel() {
		return auxwheel;
	}

	public void setAuxwheel(boolean auxwheel) {
		this.auxwheel = auxwheel;
	}

}