package garage.data;

public class Tricycle extends Vehicles {
	public Tricycle() {
	}

	private boolean bell;

	public Tricycle(String brand, int year, String colour) {
		setBrand(brand);
		setYear(year);
		setColour(colour);

	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}
}
