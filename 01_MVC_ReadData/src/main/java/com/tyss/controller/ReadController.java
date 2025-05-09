package com.tyss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ReadController {

	@RequestMapping("/hi")
	public String welcome() {
		System.out.println("index got triggered");
		return "index.jsp";
	}
	
	@RequestMapping(value = "/read" , method = RequestMethod.POST) //supports both get and post requests
	public String readData(HttpServletRequest request) {
		System.out.println("User Data is Here");
		
		String name = request.getParameter("un");
		String email = request.getParameter("ue");
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		
		return "";
	}
}
