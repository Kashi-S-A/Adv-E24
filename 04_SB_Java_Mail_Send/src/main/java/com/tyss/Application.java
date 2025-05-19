package com.tyss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyss.service.EmailService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws MessagingException {

		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);

		EmailService bean = ac.getBean(EmailService.class);

//		bean.sendMail("indhug11131@gmail.com", "About spring boot class ",
//				"Dear Student, Spring boot is about to complete and we wind up the  batch once projected done");
		
		bean.sendPage("indhug11131@gmail.com", "Requsting to forgot password");
	}

}
