package garage.data;

public class Tricycle extends Vehicle {

	public Tricycle(String brand, int year, String colour, boolean bell) {
		super(brand, year, colour);
		this.bell = bell;
	}

//	default constructor
	public Tricycle() {
		super();
	}

	@Override
	public void print() {
		super.print();

		System.out.println("Does it have a bell?: " + this.bell);
	}

	private boolean bell;

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

}