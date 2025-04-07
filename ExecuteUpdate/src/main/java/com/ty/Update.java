package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=root";
		String driver = "org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url);
			
			String query = "UPDATE student SET phone=? WHERE name=?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, 123);
			pstm.setString(2, "Peter");
			
			int result = pstm.executeUpdate();
			
			System.out.println(result+ " is the number of rows affected");
		
			con.close();
			
			System.out.println("record is updated");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
