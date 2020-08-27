package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Step02URLTemplateController {

	//{} 동적 url 구성 문법
	//urlTest/data or urlTest/khk or urlTest/lee
	/* @PathVariable String id
	 * url template에 포함된 id라는 표기의 값을 request에 저장해서 활용
	 * 
	 */
	@RequestMapping("urlTest/{id}")
	public String u1(@PathVariable String id) {
		System.out.println("u1 : " + id);
		return "forward:/urlTemplateView.jsp"; //${requestScope.id}-${requestScope.age}
	}
	
	@RequestMapping("urlTest/{id}/playdata/{age}")
	public String u2(@PathVariable String id, @PathVariable int age) {
		System.out.println("u2 : " + id + " age : " + age);
		return "forward:/urlTemplateView.jsp"; //${requestScope.id}-${requestScope.age}
	}
}
