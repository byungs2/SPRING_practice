package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Controller라는 의미
@Controller 
public class FirstController {

	//http://ip:port/context명/one 으로 실행되는 메소드
	@RequestMapping(value="one", method=RequestMethod.GET )
	public String m1() {
		System.out.println("m1() 실행");
		return "redirect:view.jsp"; //redirect로 view.jsp로 직접 이동
	}
	
	//데이터를 request에 저장해서 forward 방식으로 viewData.jsp로 화면 이동
	//request.setAttribute("key", data)
	@RequestMapping(value="two", method=RequestMethod.GET )
	public ModelAndView m2() {
		System.out.println("m2() 실행");
		
		ModelAndView mv = new ModelAndView();
		
		//데이터 저장
		mv.addObject("key", "data");
		
		//view 지정
		mv.setViewName("view2"); // /WEB-INF/view2.jsp 구조로 인식
		
		return mv; //redirect로 view2.jsp로 직접 이동
	}
	
}
