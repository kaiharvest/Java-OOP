package programmer.zama.now.application;

import programmer.zama.now.Error.DatabaseError;

public class DatabaseApp {
	public static void main(String[] args) {
		connectDatabases("indra", "null");
		System.out.println("Sukses");
	}

	public static void connectDatabases(String username, String password) {
		if (username == null || password == null) {
			throw new DatabaseError("Tidak bisa connect ke database");
		}
	}
}
