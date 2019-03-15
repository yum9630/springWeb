package spring.web.ch10.ex02.service;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MimeMailServiceImpl implements MimeMailService{
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void send(){
		MimeMessage message = mailSender.createMimeMessage();
		String txt = "<i>안녕</i>, 잘 지내고 <mark>있니?</mark><br>";
		txt += "<a href='https://www.bunker1.net'>벙커1</a>";
		try{
			message.addRecipient(RecipientType.TO, new InternetAddress("saradapang@gmail.com"));
			message.setSubject("안부");
			message.setText(txt, "utf-8", "html");
		}catch(Exception e){}
		mailSender.send(message);
	}

}
