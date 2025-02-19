package programmer.zama.now.application;

public class EqualsApp {
	public static void main(String[] args) {
		String firs = "Indra";
		firs = firs + " " + "Dwi";

		System.out.println(firs);

		String secound = "Indra Dwi";
		System.out.println(secound);

		System.out.println(firs == secound);
		System.out.println(firs.equals(secound));

		String third = "Indra Dwi";
		System.out.println(third == secound);
		System.out.println(secound.equals(third));
	}
}
