package garage.data;

public class Bicycle extends Vehicles {

	private int wheelsize;

	public Bicycle(String brand, int year, String colour, int wheelsize) {
		setBrand(brand);
		setYear(year);
		setColour(colour);
		this.wheelsize = wheelsize;
	}

	public int isWheelsize() {
		return wheelsize;
	}

	public void setWheelsize(int wheelsize) {
		this.wheelsize = wheelsize;
	}

}
