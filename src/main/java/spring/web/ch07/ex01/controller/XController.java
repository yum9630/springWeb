package spring.web.ch07.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.web.ch07.ex01.service.XService;

@Controller
@RequestMapping("/ch07/ex01/x")
public class XController {
	@Autowired private XService xService;
	
	@RequestMapping
	public String main(){
		return "ch07/ex01/x";
	}
	
	@ResponseBody
	@RequestMapping("/good")
	public int good(){
		return xService.good();
	}
	
	@ResponseBody
	@RequestMapping("/badWithX")
	public int badWithX(){
		return xService.badWithX();
	}
	
	@ResponseBody
	@RequestMapping("/badNoX")
	public int badNoX(){
		return xService.badNoX();
	}
	
	@ResponseBody
	@RequestMapping("/badService")
	public int badService(){
		return xService.badService();
	}
	
	@ResponseBody
	@RequestMapping("/listNums")
	public List<Integer> listNums(){
		return xService.listNums();
	}
	
}
