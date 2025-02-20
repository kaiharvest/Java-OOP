package programmer.zama.now.application;

import programmer.zama.now.data.LoginRequest;

public class RecordApp {
	public static void main(String[] args) {
		LoginRequest loginRequest = new LoginRequest("Eko", "rahasia");

		System.out.println(loginRequest.username());
		System.out.println(loginRequest.password());
		System.out.println(loginRequest);

		System.out.println(new LoginRequest());
		System.out.println(new LoginRequest("indra"));
		System.out.println(new LoginRequest("joko", "kimay"));
	}
}
