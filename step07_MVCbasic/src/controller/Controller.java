package controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping
	public String m1() {
		return "redirect:somethig.jsp";
	}
}
