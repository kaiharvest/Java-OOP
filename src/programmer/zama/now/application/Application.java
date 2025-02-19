package programmer.zama.now.application;

import programmer.zama.now.data.Product;

public class Application {
	public static void main(String[] args) {
		Product product = new Product("mac air m1", 10000000);

		System.out.println(product.name);
		System.out.println(product.price);
	}
}
