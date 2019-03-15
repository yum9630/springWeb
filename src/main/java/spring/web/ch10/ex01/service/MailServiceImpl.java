package spring.web.ch10.ex01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl implements MailService{
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void send(){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("saradapang@gmail.com");
		message.setSubject("안부");
		message.setText("안녕, 잘 지내고 있니?");
		mailSender.send(message);
	}

}
