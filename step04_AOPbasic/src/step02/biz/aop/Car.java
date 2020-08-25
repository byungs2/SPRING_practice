package step02.biz.aop;

//구매, 판매 로직의 핵심 기능이라 가정
public class Car {
	//구매
	public void buy() {
		System.out.println("자동차 구매");
	}
	
	public void buyMoney(int money) {
		System.out.println("자동차 구입한 금액 " + money);
	}
	
	public void buy2() {
		System.out.println("자동차 구매");
	}
	
	public void buyMoney2(int money) {
		System.out.println("자동차 구입한 금액 " + money);
	}
	
	
	//리턴 후 출력하고자 하는 메세
	public String buyReturn() {
		System.out.println("buyReturn methods");
		return "자동차 구매 성공";
	}
	
	//..
	//판매 금액이 1000만원 이하인 경우에 예외 발생
	public void saleMoney(int money) throws Exception {
		if(money <= 1000) {
			throw new Exception("너무 싸!!!");
		}else {
			System.out.println("판매완료");
		}
	}
}
