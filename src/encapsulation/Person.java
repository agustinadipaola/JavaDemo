package encapsulation;

public class Person {

	private String name;
	private String lastname;
	private int age;
	private String motherlenguage;

	public void print() {
		System.out.println("My full name is: " + name + lastname);
		System.out.println("I am " + age + " years old");
		System.out.println("I speak: " + motherlenguage);

	}

	public void setAge(int age) {
		if (age >= 0 && age < 99) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and 99");
		}
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMotherlenguage() {
		return motherlenguage;
	}

	public void setMotherlenguage(String motherlenguage) {
		this.motherlenguage = motherlenguage;
	}

}