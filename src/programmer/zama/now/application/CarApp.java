package programmer.zama.now.application;

import programmer.zama.now.data.Avanza;
import programmer.zama.now.data.Car;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Avanza();
		System.out.println(car.getTier());
		car.drive();
	}
}
