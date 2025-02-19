package VariableHiding;

class Child extends Parent{
	String name;

	void doId() {
		System.out.println("Do it child");
		System.out.println("Parent name is " + super.name);
	}
}
