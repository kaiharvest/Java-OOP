package Inheritance;

public class Polymorphism {
	public static void main(String[] args) {
		Employee employee = new Employee("Eko");
		employee.sayHello("Budi");

		employee = new Manager("Eko");
		employee.sayHello("Budi");

		employee = new VicePresident("Eko");
		employee.sayHello("Budi");

		sayHello(new Employee("Eko"));
		sayHello(new Manager("Joko"));
		sayHello(new VicePresident("Budi"));
	}

	static void sayHello(Employee employee) {
		if (employee instanceof VicePresident) {
			System.out.println("Hello VP " + employee.name);
		} else if (employee instanceof Manager) {
			System.out.println("Hello Manager " + employee.name);
		} else {
			System.out.println("Hello " + employee.name);
		}
	}
}
