package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecords {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=root";
		String driver = "org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			//Other way of creating connection
			Connection con = DriverManager.getConnection(url);
			
			Statement stm = con.createStatement();
			
			String sql = "SELECT * FROM student";
			
			ResultSet rs = stm.executeQuery(sql);
			
			System.out.println("------------Students------------");
			
			while (rs.next()) {
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				long phone = rs.getLong(3);
				
				System.out.println(sid);
				System.out.println(name);
				System.out.println(phone);
				System.out.println("======================");
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
