package spring.web.ch09.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ch09/ex02")
public class ArticleController {
	@RequestMapping("/article")
	public void article(){}

}
