package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagea")
public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageA");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageA</h1>");
		
		req.setAttribute("pid", 101);
		req.setAttribute("pname", "Cooper");
		
		RequestDispatcher rd = req.getRequestDispatcher("pageb");//url of a servlet to which we want request to be forwarded
		rd.forward(req, resp);
//		rd.include(req, resp);
	}
}
