package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class Read extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String pwd = req.getParameter("userPwd");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(pwd);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>User with Below name and email has been sent the req</h1>");
		pw.print("<h1>Name : "+name+"</h1>");
		pw.print("<h1>Email : "+email+"</h1>");
	}
}
