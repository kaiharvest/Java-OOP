package programmer.zama.now.data;

public class ProductApp {
	public static void main(String[] args) {
		Product product = new Product("mac air m1", 10000000);

		System.out.println(product.name);
		System.out.println(product.price);

		System.out.println(product);

		Product product2 = new Product("mac air m1", 10000000);
		System.out.println(product.equals(product2));
	}
}
