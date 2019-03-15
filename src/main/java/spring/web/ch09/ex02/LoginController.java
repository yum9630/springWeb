package spring.web.ch09.ex02;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ch09/ex02")
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
		public void logIn(){}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void logIn(HttpSession session, String userId, String userPw){
		if(userId != null) session.setAttribute("userId", userId);
	}

}
