package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//controller 의미
@Controller
public class FirstController {
	
	
	//http://ip:port/context명/one 으로 실행되는 메소드
	@RequestMapping(value = "one", method = RequestMethod.GET)
	public String m1() {
		System.out.println("m1() 실행");
		return "redirect:view.jsp";
	}
	
	
	@RequestMapping(value = "two")
	public ModelAndView m2() {
		System.out.println("m2() 실행");
		ModelAndView mv = new ModelAndView();
		mv.addObject("key","data");
		mv.setViewName("view2"); // WEB-INF/view.jsp 경로로 인식 (prefix suffix 때문)
		return mv;
	}
}
