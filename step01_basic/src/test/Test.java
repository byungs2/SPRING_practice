package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.People;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		People p1 = context.getBean("p1", People.class);
		System.out.println(p1);
		People p4 = context.getBean("p1", People.class);
		System.out.println(p4);
		People p2 = context.getBean("p2", People.class);
		System.out.println(p2);
		People p3 = context.getBean("p2", People.class);
		System.out.println(p3);
		People p5 = context.getBean("p3", People.class);
		System.out.println(p5);
		People p6 = context.getBean("p3", People.class);
		System.out.println(p6);
	}
}
