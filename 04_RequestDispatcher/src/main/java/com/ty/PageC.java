package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagec")
public class PageC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageC");

		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageC</h1>");

		RequestDispatcher rd = req.getRequestDispatcher("demo.html");// name(test.jsp/demo.html) of file to which we want request to be
		rd.forward(req, resp);
//		rd.include(req, resp);
	}
}
