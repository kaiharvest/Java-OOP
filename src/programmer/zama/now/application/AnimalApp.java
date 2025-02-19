package programmer.zama.now.application;

import programmer.zama.now.data.Animal;
import programmer.zama.now.data.Cat;

public class AnimalApp {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "Puss";
		animal.run();
	}
}
