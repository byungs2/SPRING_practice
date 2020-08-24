package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step03.model.domain.copy.People;


public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata3.xml");
		People p1 = (People)context.getBean("p");
		System.out.println(p1.getCar());
	}
}
