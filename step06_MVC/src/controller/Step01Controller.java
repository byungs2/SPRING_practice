package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import model.domain.Customer;

@Controller
public class Step01Controller {
	
	@RequestMapping("hello")
	public String m1() {
		System.out.println("m1()");
		return "redirect:step01/hello1RedirectView.jsp";
	}
	@RequestMapping("hello2")
	public ModelAndView m2() {
		System.out.println("m2");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "hello2world");
		mv.addObject("id", "LBH");
		mv.setViewName("step01/hello2View");
		return mv;
	}
	
	//일괄적인 예외처리 개발 기술
	@RequestMapping("hello3")
	public String m3() throws Exception{
		System.out.println("m3()");
		if(true) {
			throw new Exception();
		}
		return null;
	}
	
	@ExceptionHandler
	public String handling(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		return "redirect:failView.jsp";
	}
	
	//redirect시에도 parameter 사용할 수 있는 기술
	// 1. <mvc:annotation-driven/>
	// 2. RedirectAttributes API
	// 3. 
	@RequestMapping("hello4")
	public String m4(RedirectAttributes attr) {
		System.out.println("m4()");
		attr.addAttribute("msg", "I hope you were me");
		return "redirect:step01/hello4RedirectView.jsp";
	}
	
	
	@RequestMapping("getData1")
	public ModelAndView m5(@RequestParam("id") String id, @RequestParam("age") int age) {
		ModelAndView mv = new ModelAndView();
		System.out.println("m5()"+id+age);
		mv.setViewName("step01/getData1View");
		return mv;
	}
	
	//request와 유사한 기능의 API
	//addAttribute()은 setAttribute과 비슷
	//DTO 객체 자동 생성하여 request에 저장시 함께 parameter로 선언  - Model에 자동으로 DTO 저장
	@RequestMapping("getData2")
	public String m6(Model model, Customer cust) {
		System.out.println("m6"+cust.getId());
		model.addAttribute("msg", "new Data");
		model.addAttribute("cust",cust);
		return "step01/getData2View"; //redirect를 안하면 forward 방식으로 페이지 이동
	}
	//@ModelAttribute
	//request.setAttr("cust",cust)
	@RequestMapping("getData3")
	public String m7(@ModelAttribute("cust") Customer cust) {
		System.out.println("m7");
		return "step01/getData3View";
	}
}
