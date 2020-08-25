package running;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import step02.biz.Car;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("encoreAOP2.xml");
		
		Car car = context.getBean("car", Car.class);
		try {
			car.saleMoney(100);
		} catch (Exception e) {
		}

	}

}
