package com.tyss.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	// just to send a simple email
	public void sendMail(String to, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);
		javaMailSender.send(message);

		System.out.println("Email has been sent");
	}

	// send email with html files and attachments.
	
	@Autowired
	private TemplateEngine templateEngine;

	public void sendPage(String to, String subject) throws MessagingException {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage, true);//true bcz to send attachments along with email
	
		String body = templateEngine.process("forgot-password", new Context());
		
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body, true);//pass true if body contains html code else pass false
		
		helper.addAttachment("Spring-Notes", new File("C:\\Users\\asus\\Downloads\\Spring.pdf"));
		
		javaMailSender.send(mimeMessage);
		
		System.out.println("sent");
	}
}
