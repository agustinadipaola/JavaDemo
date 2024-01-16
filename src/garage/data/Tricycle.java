package garage.data;

public class Tricycle extends Vehicles {
	public Tricycle() {
	}

	private boolean bell;

	public Tricycle(String brand, int year, String colour, boolean bell) {
		setBrand(brand);
		setYear(year);
		setColour(colour);
		this.bell = bell;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}
}
