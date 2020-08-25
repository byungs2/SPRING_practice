package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step01.biz.Car;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("encoreAOP.xml");
		
		Car car = context.getBean("biz", Car.class);
		try {
			car.saleMoney(10);
		} catch (Exception e) {
		}
		car.buyMoney(10);
		
		String v = car.buyReturn();
		System.out.println("-------"+v);

	}

}
