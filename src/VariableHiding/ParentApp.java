package VariableHiding;

public class ParentApp {
	public static void main(String[] args) {
		Child child = new Child();
		child.name = "Indra";
		child.doId();
		System.out.println(child.name);

		Parent parent = child;
		parent.doId();
		System.out.println(parent.name);
	}
}
