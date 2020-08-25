package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step03.ano.biz.aop.Car;

public class Step03Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
		Car car = context.getBean("car", Car.class);
		String result = car.buyReturn();
//		System.out.println(result);
		try {
			car.saleMoney(10);
		} catch (Exception e) {
		}
	}

}
