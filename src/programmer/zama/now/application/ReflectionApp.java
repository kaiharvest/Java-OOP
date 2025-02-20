package programmer.zama.now.application;

import programmer.zama.now.Util.ValidationUtil;
import programmer.zama.now.data.CreateUserRequest;

public class ReflectionApp {
	public static void main(String[] args) {

		CreateUserRequest request = new CreateUserRequest();
		request.setUsername("eko");
		request.setPassword("eko");
		request.setName("eko");

		ValidationUtil.validationReflection(request);

	}
}
