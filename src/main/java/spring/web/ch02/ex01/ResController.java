package spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch02/ex01")
public class ResController {
	@RequestMapping("/img")
	public void image(){}
	
	@RequestMapping("/css")
	public void css(){}
	
	@RequestMapping("/js")
	public void js(){}

}
