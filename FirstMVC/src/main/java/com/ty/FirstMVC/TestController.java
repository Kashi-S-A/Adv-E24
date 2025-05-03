package com.ty.FirstMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@RequestMapping("/demo")
	public String demo() {
		System.out.println("triggered");
		return "index.jsp";
	}
	
	
	
}
