package com.tyss.ca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.ca.entity.Contact;
import com.tyss.ca.entity.User;
import com.tyss.ca.service.ContactService;
import com.tyss.ca.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("index.jsp");
		mv.addObject("user", new User());

		return mv;
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}

	@PostMapping("/register")
	public ModelAndView register(User user) {

		boolean result = userService.registerUser(user);
		ModelAndView mv = new ModelAndView("login.jsp");
		if (result) {
			// registered successfully
			mv.addObject("msg", "registered successfully");
		} else {
			// already register
			mv.addObject("msg", "already registered");
		}

		return mv;
	}

	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		String email = request.getParameter("uemail");
		String password = request.getParameter("upwd");

		boolean result = userService.login(email, password);
		ModelAndView mv = new ModelAndView();
		if (result) {
			// logged in succ create a session to save logged in users state
			mv.setViewName("home.jsp");

			List<Contact> contacts = userService.findContactsByUser(email);
			mv.addObject("contacts", contacts);

			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);

		} else {
			// invalid credentials
			mv.setViewName("login.jsp");
			mv.addObject("msg", "Invalid Credentials");
		}

		return mv;
	}

}
