package garage.data;

public class Car extends Vehicles {

	private boolean auxwheel;

	public Car(String brand, int year, String colour, boolean auxwheel) {
		setBrand(brand);
		setYear(year);
		setColour(colour);
		this.auxwheel = auxwheel;
	}

	public boolean isAuxwheel() {
		return auxwheel;
	}

	public void setAuxwheel(boolean auxwheel) {
		this.auxwheel = auxwheel;
	}
}
