package com.ty.stm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college?user=postgres&password=root";
		String driver = "org.postgresql.Driver";
		
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url);
			
			String procedure = "CALL procedure_name(?,?,?)";//cmd to call procedure
			
			String function = "SELECT function_name(?,?)";//cmd to call function
			
			CallableStatement cstm = con.prepareCall(procedure);
			cstm.setInt(1, 101);
			cstm.setString(2, "Cooper");
			cstm.setLong(3, 3457843);
			
			cstm.execute();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
