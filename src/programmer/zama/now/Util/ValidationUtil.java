package programmer.zama.now.Util;

import programmer.zama.now.Error.BlankException;
import programmer.zama.now.Error.ValidationException;
import programmer.zama.now.data.LoginRequest;

public class ValidationUtil {

	public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is Null");
		} else if (loginRequest.username().isBlank()) {
			throw new ValidationException("Username is Null");
		} if (loginRequest.password() == null) {
			throw new NullPointerException("Password is Null");
		} else if (loginRequest.password().isBlank()) {
			throw new ValidationException("Password is Null");
		}
	}


	public static void validateRuntime(LoginRequest loginRequest) {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is Null");
		} else if (loginRequest.username().isBlank()) {
			throw new BlankException("Username is Null");
		} if (loginRequest.password() == null) {
			throw new NullPointerException("Password is Null");
		} else if (loginRequest.password().isBlank()) {
			throw new BlankException("Password is Null");
		}
	}

}
