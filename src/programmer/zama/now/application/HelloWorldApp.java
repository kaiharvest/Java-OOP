package programmer.zama.now.application;

import programmer.zama.now.data.HelloWorld;

public class HelloWorldApp {
	public static void main(String[] args) {
		HelloWorld engish = new HelloWorld() {
			public void sayHello() {
				System.out.println("Hello");
			}

			public void sayHello(String name) {
				System.out.println("Hello " + name);
			}
		};

		engish.sayHello();
		engish.sayHello("Eko");
	}
}
