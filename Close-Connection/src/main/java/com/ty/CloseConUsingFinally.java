package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseConUsingFinally {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=roo";
		String driver = "org.postgresql.Driver";

		Connection con = null;

		try {
			Class.forName(driver);
			System.out.println("driver is loaded");

			con = DriverManager.getConnection(url);
			System.out.println("connection is created");

			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String sql = "SELEC  FROM student";

			stm.execute(sql);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con!=null) {
					con.close();
					System.out.println("connection closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
