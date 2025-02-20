package programmer.zama.now.application;

import programmer.zama.now.data.Customer;
import programmer.zama.now.data.Level;

public class EnumApp {
	public static void main(String[] args) {
		Customer customer = new Customer();

		customer.setName("Indra");
		customer.setLevel(Level.PREMIUM);

		System.out.println(customer.getName());
		System.out.println(customer.getLevel());
		System.out.println(customer.getLevel().getDescription());

		String levelName = Level.VIP.name();
		System.out.println(levelName);

		Level level = Level.valueOf("PREMIUM");
		System.out.println(level);

		System.out.println("Print level");
		Level[] levels = Level.values();
		for (var value : Level.values()) {
			System.out.println(value);
		}
	}
}
