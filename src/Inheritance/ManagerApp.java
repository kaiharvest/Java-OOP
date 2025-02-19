package Inheritance;

public class ManagerApp {
	public static void main(String[] args) {
		Manager manager = new Manager("Eko");
		manager.sayHello("Budi");

		VicePresident vp = new VicePresident("Joko");
		vp.sayHello("Budi");

		System.out.println(manager);
		System.out.println(vp);
	}
}
