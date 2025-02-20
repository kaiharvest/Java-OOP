package programmer.zama.now.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("READMI.md"))){
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}

		} catch (Throwable throwable) {
			System.out.println("Error membaca file " + throwable.getMessage());
		}

	}
}
