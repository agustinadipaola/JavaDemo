package encapsulation;

public class App {

	public static void main(String[] args) {
		Person indiv = new Person();
		indiv.setName("Tad");
		indiv.setLastname("as");
		indiv.setAge(30);
		indiv.setMotherlenguage("Lithuanian");

		indiv.print();
		Person indiv2 = new Person();
		indiv2.setName("Bia");
		indiv2.setLastname("nca");
		indiv2.setAge(28);
		indiv2.setMotherlenguage("Spanish");

		indiv2.print();

		Person indiv3 = new Person();
		indiv3.setName("El");
		indiv3.setLastname("ena");
		indiv3.setAge(33);
		indiv3.setMotherlenguage("Italian");

		indiv3.print();

		Person[] persons = { indiv, indiv2, indiv3 };
		for (Person person : persons) {
			person.print();
			person.getAge();
		}
		indiv.setAge(indiv.getAge() + 1);

	}

}