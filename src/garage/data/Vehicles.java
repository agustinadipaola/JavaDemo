package garage.data;

public class Vehicles {
	private String brand;
	private int year;
	private String colour;

	public Vehicles() {

	}

	public Vehicles(String brand, int year, String colour) {
		super();
		this.brand = brand;
		this.year = year;
		this.colour = colour;
	}

	public void print() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Year: " + this.year);
		System.out.println("Colour: " + this.colour);

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
