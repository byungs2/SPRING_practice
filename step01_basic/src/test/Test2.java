package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.People;

//parameter가 있는 생성자 test
public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		People p1 = context.getBean("p11", People.class);
		System.out.println(p1);
		People p2 = context.getBean("p12", People.class);
		System.out.println(p2);
	}
}
