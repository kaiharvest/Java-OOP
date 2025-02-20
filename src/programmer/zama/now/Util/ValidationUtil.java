package programmer.zama.now.Util;

import programmer.zama.now.Anotation.NotBlank;
import programmer.zama.now.Error.BlankException;
import programmer.zama.now.Error.ValidationException;
import programmer.zama.now.data.LoginRequest;

import java.lang.reflect.Field;

public class ValidationUtil {

	public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is Null");
		} else if (loginRequest.username().isBlank()) {
			throw new ValidationException("Username is Blank");
		}
		if (loginRequest.password() == null) {
			throw new NullPointerException("Password is Null");
		} else if (loginRequest.password().isBlank()) {
			throw new ValidationException("Password is Blank");
		}
	}

	public static void validateRuntime(LoginRequest loginRequest) {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is Null");
		} else if (loginRequest.username().isBlank()) {
			throw new BlankException("Username is Blank");
		}
		if (loginRequest.password() == null) {
			throw new NullPointerException("Password is Null");
		} else if (loginRequest.password().isBlank()) {
			throw new BlankException("Password is Blank");
		}
	}

	public static void validationReflection(Object object) {
		Class aClass = object.getClass();
		Field[] fields = aClass.getDeclaredFields();

		for (var field : fields) {
			field.setAccessible(true);

			if (field.isAnnotationPresent(NotBlank.class)) {
				try {
					String value = (String) field.get(object);

					if (value instanceof String stringValue) {
						if (stringValue.isBlank()) {
							throw new BlankException("Field " + field.getName() + " is Blank");
						}
					}

				} catch (IllegalAccessException exception) {
					System.out.println("Tidak bisa mengakses field " + field.getName());
				}
			}
		}
	}
}
