package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step04.model.domain.People;


public class Test4 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata4.xml");
		People p1 = (People)context.getBean("p");
		System.out.println(p1);
		p1.getCars().get(0).setCarName("SONATA");
		p1.getCars().get(0).setCarNo(77);
		System.out.println(p1.getCars());
	}
}
