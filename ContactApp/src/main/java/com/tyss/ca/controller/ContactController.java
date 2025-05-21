package com.tyss.ca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.ca.entity.Contact;
import com.tyss.ca.entity.User;
import com.tyss.ca.service.ContactService;
import com.tyss.ca.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;

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

			HttpSession session = request.getSession(true);// manage the logged in user's state(for a application only
															// one HttpSession object). if you pass true it will create
															// new
															// HttpSession object if not exists if already exists then
															// it will return the existing object. if we false it will
															// return httpSession object only if it is exists and
															// returns null if it is not exists.
			session.setAttribute("email", email);

		} else {
			// invalid credentials
			mv.setViewName("login.jsp");
			mv.addObject("msg", "Invalid Credentials");
		}

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add() {

		ModelAndView mv = new ModelAndView("contact.jsp");
		mv.addObject("contact", new Contact());

		return mv;
	}

	@PostMapping("/add")
	public ModelAndView addContact(Contact contact, HttpServletRequest request) {

		System.out.println(contact);

		HttpSession session = request.getSession(false);
		String email = (String) session.getAttribute("email");

		User loggedInUser = userService.getByEmail(email);
		contact.setUser(loggedInUser);

		Contact savedContact = contactService.saveContact(contact);
		ModelAndView mv = new ModelAndView("home.jsp");

		if (savedContact != null) {
			mv.addObject("msg", "added succesfully");
			mv.addObject("contacts", savedContact.getUser().getContacts());
		} else {
			mv.addObject("msg", "already added");
		}
		return mv;
	}

	@GetMapping("/edit")
	public ModelAndView editContact(@RequestParam Integer cid) {

		Contact contact = contactService.getById(cid);

		ModelAndView mv = new ModelAndView("contact.jsp");
		mv.addObject("contact", contact);

		return mv;
	}

	@GetMapping("/delete")
	public ModelAndView deleteContact(@RequestParam Integer cid) {

		Contact contact = contactService.getById(cid);

		ModelAndView mv = new ModelAndView("home.jsp");
		mv.addObject("msg", "deleted Successfully");
		mv.addObject("contacts", contact.getUser().getContacts());

		contactService.deleteById(cid);

		return mv;
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		session.invalidate();//end the session 
		
		return "login.jsp";
	}
	

}
