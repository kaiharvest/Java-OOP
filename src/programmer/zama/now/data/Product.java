package programmer.zama.now.data;

import java.util.Objects;

public class Product {
	public String name;
	public int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Product name: " + name + " price " + price;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;
		return price == product.price && Objects.equals(name, product.name);
	}
}
