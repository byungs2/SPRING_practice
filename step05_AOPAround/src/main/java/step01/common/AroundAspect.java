package step01.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAspect {
	public Object aroudAspect(ProceedingJoinPoint point) {
		System.out.println("전처리");
		System.out.println("*** 1. 구매를 시작 하실 건가요? ***");
		//핵심 기능의 메소드를 호출하는 표준화된 코드 
		Object returnValue = null;
		try {
			returnValue = point.proceed();
			//System.out.println("리턴후 처리 로직 " + returnValue);
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("발생된 문제 : " + e.getMessage());
		}
		System.out.println("후처리");
		System.out.println("*** 2. 구매를 완료 하셨습니다 ***");
		System.out.println("리턴후 처리 로직 " + returnValue);
		return returnValue;
	}
}
