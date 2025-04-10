package com.ty.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageD")
public class PageD extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageD");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageD</h1>");
		
		resp.sendRedirect("https://www.instagram.com/");// you can pass url of servlet also/jsp page name/html page name also
	}
}
