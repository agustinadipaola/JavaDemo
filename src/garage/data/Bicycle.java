package garage.data;

public class Bicycle extends Vehicle {

	public Bicycle(String brand, int year, String colour, int wheelsize) {
		super(brand, year, colour);
		this.wheelsize = wheelsize;
	}

//	default constructor
	public Bicycle() {
		super();
	}

	@Override
	public void print() {
		super.print();

		System.out.println("What's the wheel size?: " + this.wheelsize);

	}

	private int wheelsize;

	public int isWheelsize() {
		return wheelsize;
	}

	public void setWheelsize(int wheelsize) {
		this.wheelsize = wheelsize;
	}

}
