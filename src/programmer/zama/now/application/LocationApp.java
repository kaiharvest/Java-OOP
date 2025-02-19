package programmer.zama.now.application;

import programmer.zama.now.data.City;

public class LocationApp {
	public static void main(String[] args) {
		// Location location = new Location(); ERROR

		City city = new City();
		city.name = "Jakarta";
		System.out.println(city.name);
	}
}
