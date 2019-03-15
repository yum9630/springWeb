package spring.web.ch10.ex01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.ch10.ex01.service.MailService;


@Controller
public class MailController {
	@Autowired private MailService mailService;
	
	@RequestMapping("/ch10/ex01/mail")
	public void send(){
		mailService.send();
	}

}
