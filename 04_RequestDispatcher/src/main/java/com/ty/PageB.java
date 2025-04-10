package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageb")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageB");
		
		int personId = (Integer) req.getAttribute("pid");
		String personName = (String) req.getAttribute("pname");

		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageB</h1>");
		pw.print("<h2>Pid : "+personId+"</h2>");
		pw.print("<h2>Name : "+personName+"</h2>");
		
	}
}
