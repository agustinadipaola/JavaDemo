package garage.data;

public class Car extends Vehicles {

	private boolean auxwheel;

	public Car(String brand, int year, String colour) {
		setBrand(brand);
		setYear(year);
		setColour(colour);
	}

	public auxwheel isAuxwheel() {
		return auxwheel;
	}

	public void setAuxwheel(boolean auxwheel) {
		this.auxwheel = auxwheel;
	}
}
