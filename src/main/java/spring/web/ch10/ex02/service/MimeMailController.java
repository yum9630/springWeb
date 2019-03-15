package spring.web.ch10.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.ch10.ex02.service.MimeMailService;

@Controller
public class MimeMailController {
	@Autowired private MimeMailService mailService;
	
	@RequestMapping("/ch10/ex02/mail")
	public void send(){
		mailService.send();
	}

}
