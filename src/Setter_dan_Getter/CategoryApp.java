package Setter_dan_Getter;

public class CategoryApp {
	public static void main(String[] args) {
		Category category = new Category();
		category.setId("ID");
		category.setId(null);

		System.out.println(category.getId());
	}
}
