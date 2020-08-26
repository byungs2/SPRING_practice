package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step02URLTemplateController {
	
	@RequestMapping("urlTest/{id}")
	public String u1(@PathVariable String id) {
		System.out.println("u1" + id);
		return "forward:../urlTemplateView.jsp";
	}
	@RequestMapping("urlTest/{id}/{name}/{age}")
	public String u2(@PathVariable String id,@PathVariable String name, @PathVariable int age ) {
		System.out.println("u2" + id + name + age);
		return "forward:../../../urlTemplateView.jsp";
	}
}
