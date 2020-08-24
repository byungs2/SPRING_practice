package step3.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankService {

	public static void main(String[] args) {	
		//spring bean들을 관리하는 container 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		//필요한 DB연동 객체 획득하는 코드
		BankDAO dao = (BankDAO)context.getBean("dao");
		BankDAO dao2 = (BankDAO)context.getBean("dao");
		System.out.println(dao == dao2);
		//System.out.println(dao);
	}
}
             