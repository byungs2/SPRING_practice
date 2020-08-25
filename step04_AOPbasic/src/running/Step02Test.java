package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step02.biz.aop.Car;

public class Step02Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Car car = context.getBean("biz", Car.class);
		String result = car.buyReturn();
//		System.out.println(result);
		try {
			car.saleMoney(100);
		} catch (Exception e) {
		}
	}

}
