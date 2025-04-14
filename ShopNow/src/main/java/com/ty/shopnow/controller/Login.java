package com.ty.shopnow.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.shopnow.conn.ConnectionPool;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("uemail");
		String password = req.getParameter("upwd");

		try {
			Connection connection = ConnectionPool.giveConnection();

			String sql = "SELECT * FROM register WHERE email=? AND password=?";

			PreparedStatement pstm = connection.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();

			ConnectionPool.submitConnection(connection);

			if (rs.next()) {
				// TODO: Logged in succ
				RequestDispatcher rd = req.getRequestDispatcher("homepage.html");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				req.setAttribute("msg", "Invalid credentials");
				rd.forward(req, resp);
			}

		} catch (SQLException e) {
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("msg", "Something went wrong please try again later");
			rd.forward(req, resp);
			e.printStackTrace();
		}

	}
}
