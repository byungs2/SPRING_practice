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

//step01Index.html과 매핑작업하는 controller

@Controller
public class Step01Controller {

	//String 반환 : redirect로 step01/hello1RedirectView.jsp로이동
	@RequestMapping("hello")
	public String m1() {
		System.out.println("m1()");
		return "redirect:step01/hello1RedirectView.jsp";
	}
	
	//ModelandView 반환
	/* ModelAndView 
	 * 1. model - request에 setAttribute()로 데이터 저장
	 * 2. view - WEB-INF 하위에 구현되어 있는 jsp를이름만으로 지정
	 * 	- spring 설정 파일에 viewResolver 설정 필수
	 */
	@RequestMapping("hello2")
	public ModelAndView m2() {
		System.out.println("m2");
		ModelAndView mv = new ModelAndView();
		//데이터 저장
		mv.addObject("message", "playdata");
		mv.addObject("id", "itMan");
		
		//view 저장
		mv.setViewName("step01/hello2View");
		return mv;
	}
	
	/* 실행 시 예외가 발생 되었을 때 예외 처리를 일괄적으로 할 수 있는 Spring
	 * 개발 기술- 중복 코드를 최소화 
	 * 
	 */
	
	@RequestMapping("hello3")
	public String m3() throws Exception {
		System.out.println("m3");
		if(true) {
			throw new Exception();
		}
		return null;
	}
	
	@ExceptionHandler
	public String Handling(Exception e) {
		System.out.println("handling");
		e.printStackTrace();
		return "redirect:failView.jsp";
	}
	
	/* redirect로 page 이동 시에 parameter을적용할 수 있는 기술
	 * 1. 설정 필요 : <mvc:annotation-drive />
	 * 2. RedirectAttributes API
	 * 
	 */
	@RequestMapping("hello4")
	public String m4(RedirectAttributes attr) {
		System.out.println("m4()");
		attr.addAttribute("msg", "playdata info");
		
		return "redirect:step01/hello4RedirectView.jsp";
	}
	
	//getData1?id=playdataMan&age=100
	/* 1. @RequestParam("key명")
	 * 	- client가 전송하는 web query string 데이터값을 획득
	 * 	- 형변환까지 자동 적용
	 * 
	 * 2. ModelAndView 는forward 방식으로 화면 이동
	 * 	- 이동된 jsp에선 요청 객체가 유지
	 * 	- request로 부터 getParameter()가 가능
	 * 	- jsp {param.key명}
	 */
	
	@RequestMapping("getData1")
	public ModelAndView m5(@RequestParam("id") String id, @RequestParam("age") int age) {
		System.out.println("m5() " + id + " " + age);
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("step01/getData1View");
		return mv; 
	}
	/* Model
	 * 1. request와 유사한 기능의 API
	 * 2. addAttribute()는 request의 setAttribute()와 동일
	 * 3. jsp에서 출력 시 ${requestScope.key}로출력
	 * 4. DTO 객체 자동 생성해서 request에 저장 시 함께 parameter로 선언
	 * 	- Model에 addAttribute() DTO 저장
	 * 5. 주의사항
	 * 	- query string으로 유입되는 key는 DTO의 멤버와 동일한 이름
	 * 6. 실행 process
	 * 	- 전송된 데이터 값으로 Customer DTO 생성 -> 요청 객체(Model)에 저장
	 */
	@RequestMapping("getData2")
	public String m6(Model model, Customer cust) {
		System.out.println("m6()" + cust.getId());
		
		model.addAttribute("msg", "new Data");
		model.addAttribute("cust", cust);
//		model.addAttribute("msg2", "new Data");
		// @ModelAttribute와 다르게 여러개 저장 가능
		
		return "step01/getData2View"; //forward 방식으로 viewResolver를 통해서 이동
	}
	
	/* @ModelAttribute
	 * @ModelAttribute("cust") Customer cust //"cust" = key
	 * 	request.setAttribute("cust", cust);
	 */
	@RequestMapping("getData3")
	public String m7(@ModelAttribute("cust") Customer cust) {
		//이 상태로는 msg는 첨부 불가능
		System.out.println("m7( )" + cust.getId());
		return "step01/getData3View"; //forward
	}
}
