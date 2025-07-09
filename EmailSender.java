package com.firstapp.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	public void sendEmail(String to,String subject ,String Message) {
		
		
		SimpleMailMessage sm =new SimpleMailMessage();
		sm.setTo(to);
		sm.setSubject(subject);
		sm.setText(Message);
		
		mailSender.send(sm);
        System.out.println("Email sent successfully!");
	}

}
