package spring.web.ch08.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/ch08/ex01")
public class PathController {
	@RequestMapping("/user/{userNo}/add")
	public String user(@PathVariable String userNo, Model model){
		model.addAttribute("userNo", userNo);
		return "ch08/ex01/user";
	}
	
	@RequestMapping(value="/add/user/{userNo}", method=RequestMethod.GET)
	public String user2(@PathVariable("userNo") String uNo, Model model){
		model.addAttribute("userNo", uNo);
		return "ch08/ex01/user";
	}

}
