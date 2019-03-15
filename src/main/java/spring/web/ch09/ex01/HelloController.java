package spring.web.ch09.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/ch09/ex01/hello")
	public void hello(){
		System.out.println("/ch09/ex01/hello");
	}

}
