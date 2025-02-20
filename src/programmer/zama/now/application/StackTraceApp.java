package programmer.zama.now.application;

public class StackTraceApp {
	public static void main(String[] args) {

		try {
			simpleError();
		} catch (RuntimeException exception) {
			exception.printStackTrace();
		}

	}

	public static void simpleError() {
		try {
			String[] name = {
					"indra", "dwi", "prabowo"
			};

			System.out.println(name[100]);
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}

}
