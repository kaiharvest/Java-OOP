package programmer.zama.now.application;

import programmer.zama.now.Anotation.Fancy;
import programmer.zama.now.data.Animal;
import programmer.zama.now.data.Cat;

@Fancy(name = "AnimalaApp", tag = {"aplication", "java"})

public class AnimalApp {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "Puss";
		animal.run();
	}
}
