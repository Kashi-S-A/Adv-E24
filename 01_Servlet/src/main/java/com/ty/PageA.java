package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PageA extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is PageA servlet");
		
		//to print on the browser 
		PrintWriter pw = res.getWriter();
		pw.print("<h1>Hi this is PageA Servlet</h1>");
	}

}
