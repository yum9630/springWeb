package spring.web.ch01.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("userParamController")
@RequestMapping("/ch01/ex03")
public class UserController {
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String in(){
		return "ch01/ex03/userIn";
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String out(User user){
		return "ch01/ex03/userOut";
	}

}
