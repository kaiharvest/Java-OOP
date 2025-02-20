package programmer.zama.now.application;

import programmer.zama.now.Error.ValidationException;
import programmer.zama.now.Util.ValidationUtil;
import programmer.zama.now.data.LoginRequest;

public class ValidationApp {
	public static void main(String[] args) {

		LoginRequest loginRequest = new LoginRequest("eko", "rahasia");

		try {
			ValidationUtil.validate(loginRequest);
			System.out.println("data valid");
		} catch (ValidationException | NullPointerException exception) {
			System.out.println("data tidak valid: " + exception.getMessage());
		} finally {
			System.out.println("Selalu di eksekusi");
		}


		LoginRequest loginRequest1 = new LoginRequest(null, null);
		ValidationUtil.validateRuntime(loginRequest1);
		System.out.println("Sukses");

	}
}
