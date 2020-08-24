package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step02.model.domain.People;


public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata2.xml");
		System.out.println("-----------step 01 --------------");
		People p1 = (People)context.getBean("people");
		System.out.println(p1.getCar());
	}
}
