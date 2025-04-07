package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=root";
		String driver = "org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url);
			
			String query = "INSERT INTO student VALUES(?,?,?)";
			
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, 7);
			pstm.setString(2, "Pengi");
			pstm.setLong(3, 7654567);
			
			int result = pstm.executeUpdate();
			
			System.out.println(result);
		
			con.close();
			
			System.out.println("record is inserted");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
