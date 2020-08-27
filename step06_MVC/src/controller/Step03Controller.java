package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import model.domain.Customer2;

@Controller
@RequestMapping("sessiontracking")
@SessionAttributes({"name", "age", "job", "cust"}) //Session key값 선 등록
public class Step03Controller {
	//쿠키 test
	
	@RequestMapping("/cookietest") // '/' 필수 '/'는 앞에 넣는 걸 선호
	public String m1(@CookieValue("id") String id) {
		System.out.println("m1()" + id);
		return "redirect:/cookieView.jsp"; // '/' 잊어버리면 안됨
	}
	
	//HttpSession API 활용
	@RequestMapping("/sessionTest1")
	public String m2(HttpSession session) {
		System.out.println("m2()" + session.getAttribute("name"));
		session.setAttribute("job", "itman");
		
		//@SessionAttributes 속성에 명시하지 않은 새로운 key의 데이터 저장
		//invalidate()로 세션 기능 무효호 시에는 HttpSession에직접 저장한 key에 한해서만삭제됨
		//
		session.setAttribute("job2", "itman2");
		return "redirect:/sessionView1.jsp";
	}
	
	//세션 기능 삭제 - HttpSession API로 setAttriute로 저장한 것에 한해서만 무효화되는 현상 발생
	@RequestMapping("/sessionDataDelete1")
	public String m3(HttpSession session) {
		System.out.println("m3()");
		session.invalidate(); //job2만 삭제가 됨
		session = null;
		return "redirect:/sessionView1.jsp";
	}
	
	@RequestMapping("/sessionDataDelete2")
	public String m4(SessionStatus status) {
		System.out.println("m4()");
		status.setComplete();
		return "redirect:/sessionView1.jsp";
	}
	
	//세션에 저장된 데이터 활용 - non-HttpSession
	@RequestMapping("/sessionTest2") 
	public String m5(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		System.out.println("m5()" + name + " " + age);
		return "redirect:/sessionView1.jsp";
	}
	
	@RequestMapping("/sessionTest3DTO") //선등록된 Session Key와 같은 이름으로 Model 객체에 addAttribute 하면 자동으로 세션 객체에 저장된다.
	public String m6(Model model, Customer2 cust) {
		System.out.println("m6"+cust.getName2());
		model.addAttribute("cust", cust);
		return "redirect:/sessionView2.jsp";
	}
	@RequestMapping("/sessionDataDelete3")
	public String m7(SessionStatus status) {
		System.out.println("m7");
		status.setComplete();
		return "redirect:/sessionView2.jsp";
	}
	
}
