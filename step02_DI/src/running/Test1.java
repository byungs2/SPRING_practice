package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.domain.People;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playdata.xml");
		System.out.println("-----------step 01 --------------");
		People p1 = (People)context.getBean("people1");
		People p2 = (People)context.getBean("people1");
		System.out.println(p1 == p2);
		
		System.out.println("-----------step 02 --------------"); //step02는 불가능 왜냐하면 People 객체는 한번만 만들어지기 때문에 car객체 역시 단 한번만 생성함
		People p3 = (People)context.getBean("people2");
		People p4 = (People)context.getBean("people2");
		System.out.println(p3.getCar());
		System.out.println(p4.getCar());
		
		System.out.println("-----------step 03 --------------");
		People p5 = (People)context.getBean("people3");
		People p6 = (People)context.getBean("people3");
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p5.getCar());
		System.out.println(p6.getCar());
		
		System.out.println("-----------step 04 --------------");
		People p7 = (People)context.getBean("people4");
		People p8 = (People)context.getBean("people4");
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p7.getCar());
		System.out.println(p8.getCar());
	}
}
