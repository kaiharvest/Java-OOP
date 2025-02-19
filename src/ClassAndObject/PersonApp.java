package ClassAndObject;

public class PersonApp {
	public static void main(String[] args) {
		Person person1 = new Person("Indra", "Cepu");
		Person person2 = new Person("Indra");
		Person person3 = new Person();

		System.out.println(person1.name);
		System.out.println(person1.addres);
		System.out.println(person1.country);
		person1.sayHello("Budi");
	}
}
