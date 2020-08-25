package step02.biz;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void buy() {
		System.out.println("자동차 구매");
	}
	
	public void buyMoney(int money) {
		System.out.println("자동차 구입한 금액 " + money);
	}
	
	public String buyReturn() {
		return "자동차 구매 성공";
	}
	
	public void saleMoney(int money) throws Exception {
		if(money <= 1000) {
			throw new Exception("너무 싸!!!");
		}else {
			System.out.println("판매완료");
		}
	}
}
