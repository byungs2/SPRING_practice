package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.People;

//Setter ½Ç½À
public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		People p1 = context.getBean("p21", People.class);
		System.out.println(p1.getName());
	}
}
