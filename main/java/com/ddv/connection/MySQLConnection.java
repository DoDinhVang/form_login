package com.ddv.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
	private static final String url = "jdbc:mysql://localhost:3306/users";

	public static Connection getConnection() {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, "root", "dodinhhuu0302@");
		} catch (Exception ex) {

			// handle the error
		}
		return null;
	}
}
