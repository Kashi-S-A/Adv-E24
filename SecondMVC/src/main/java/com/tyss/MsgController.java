package com.tyss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {

	@RequestMapping("/msg")
	public String getMsg() {
		System.out.println("Msg API got triggered");
		return "msg.jsp";
	}
	
	@RequestMapping("/greet")
	public String greetMethod() {
		System.out.println("Greet API got triggered");
		return "greet.jsp"; 
	}
}
