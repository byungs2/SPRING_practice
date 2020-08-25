package step02.common.aop;

//공통 기능의 클래스
public class NoticeAspect {
	
	//구매 전 공통 처리 로직
	public void noticBuyStart() {
		System.out.println("[공통 1] 구매를 시작 하실 건가요?");
	}
	
	//구매 후 공통 처리 로직
	public void noticBuyEnd() {
		System.out.println("[공통 2] 구매를 완료 하셨습니다");
	}
	
	//예외 발생시 실행되는 Method
	public void noticeException(Exception e) {
		System.out.println(e.getMessage());
	}
	
	//biz method가 반환하는 값이 있을 때 그 반환값 앞 뒤에 -를 적용하고 싶다
	//반환된 데이터를 공통 메소드가 받아서 가공하여 다시 반환
	
	public void noticeReturn(Object v) {
		System.out.println("--"+v+"--");
	}
}
