package spring.web.ch05.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ch05/ex01/id")
public class IdController {
	@RequestMapping
	public String form(){
		return "ch05/ex01/idIn";
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.GET)
	@ResponseBody
	public Result validateId(String loginId){
		boolean isDuplicated = false;
		if((int)(Math.random()*2)==1) isDuplicated = true;
		
		Result result = new Result();
		result.setDuplicated(isDuplicated);
		result.setAvailableId(loginId + (int)(Math.random()*1000));
		return result; //{duplicated:true, availableId:"~"}
	}

}
