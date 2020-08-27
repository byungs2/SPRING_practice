package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.domain.People;

@RestController
public class RestTest {
	//http://127.0.0.1:80/step07_MVCRest/hello
	@GetMapping("/hello")
	public String m1() {
		System.out.println("m1");
		return "test";
	}
	@GetMapping("/hello2")
	public People m2() {
		System.out.println("m2");
		People p = new People("LBH",18);
		return p;
	}
	
	@PostMapping("/people")
	public String m3(@RequestBody People p) {
		System.out.println("m3"+p.getAge()+p.getName());
		
		return "complete";
	}
}
