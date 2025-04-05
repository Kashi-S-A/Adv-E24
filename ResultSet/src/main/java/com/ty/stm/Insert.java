package com.ty.stm;

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
			pstm.setInt(1, 6);
			pstm.setString(2, "Penga");
			pstm.setLong(3, 6545678);
			
//			pstm.executeQuery();//throw exception after executing insert query bzc it does not return any result
			
			boolean result = pstm.execute();
			System.out.println(result);//false bcz insert query does not return the data/the query cannot return ResultSet
			
			con.close();
			
			System.out.println("record is inserted");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
