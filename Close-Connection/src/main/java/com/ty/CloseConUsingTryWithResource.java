package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseConUsingTryWithResource {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=roo";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection(url);) // resource
		{
			System.out.println("connection is created");

			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String sql = "SELEC  FROM student";

			stm.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
