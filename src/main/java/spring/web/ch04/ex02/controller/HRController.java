package spring.web.ch04.ex02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import spring.web.ch04.ex02.domain.Employee;
import spring.web.ch04.ex02.service.HRService;

@Controller
@RequestMapping("/ch04/ex02")
public class HRController {
	@Autowired private HRService hrService;
	
	@RequestMapping("/hr")
	@ModelAttribute("emp")
	public  Employee hrCnt(){
		return hrService.viewEmpCnt();
	}

}
