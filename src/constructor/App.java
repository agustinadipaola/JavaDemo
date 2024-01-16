package constructor;

public class App {

	public static void main(String[] args) {
		Person indiv = new Person("Tad", "as", 30, "Lithuanian");

		indiv.print();
		Person indiv2 = new Person("Bia", "nca", 28, "Spanish");
		indiv2.print();

		Person indiv3 = new Person("El", "ena", 33, "Italian");
		indiv3.print();

//		for each person of persons
		Person[] persons = { indiv, indiv2, indiv3 };
		for (Person person : persons) {
			person.print();
			person.getAge();
		}
		indiv.setAge(indiv.getAge() + 1);

	}

}