package com.tyss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ReadController {

	@RequestMapping("/hi")
	public String welcome() {
		System.out.println("index got triggered");
		return "index.jsp";
	}
	
	@RequestMapping(value = "/read" , method = RequestMethod.POST) //supports both get and post requests
	public ModelAndView readData(HttpServletRequest request) {
		System.out.println("User Data is Here");
		
		String name = request.getParameter("un");
		String email = request.getParameter("ue");
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		
		ModelAndView mv = new ModelAndView("data.jsp");
		mv.addObject("userName", name);
		mv.addObject("userEmail", email);
		
		return mv;
	}
	
	@RequestMapping("/send")
	public String sendData(Model model) {
		
		String name = "Penga";
		String email = "penga@gmail.com";
		long phone = 2345678;
		
		model.addAttribute("uname", name);
		model.addAttribute("uemail", email);
		model.addAttribute("uphone", phone);
		
		return "display.jsp";
	}
	
	@RequestMapping("/pass")
	public ModelAndView passData() {
		
		String userName = "Peter";
		String userId = "1234ABCD";
		
		ModelAndView mv = new ModelAndView("pass.jsp");
		
		mv.addObject("uid", userId);
		mv.addObject("uname", userName);
		
//		mv.setViewName("pass.jsp");
		
		Employee emp = new Employee();
		emp.setEmpId("TYP123");
		emp.setName("Jacob");
		emp.setSalary(70000);
		
		mv.addObject("empl", emp);
		
		return mv;
	}
}
