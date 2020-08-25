package step03.ano.common.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NoticeAspect {
	
	@Before("execution(* step03.ano.biz.aop.Car.buy*(..))")
	public void noticBuyStart() {
		System.out.println("[공통 1] 구매를 시작 하실 건가요?");
	}
	
	@After("execution(* step03.ano.biz.aop.Car.buy*(..))")
	public void noticBuyEnd() {
		System.out.println("[공통 2] 구매를 완료 하셨습니다");
	}
	
	@AfterThrowing(pointcut=("execution(* step03.ano.biz.aop.Car.sale*(..))"), throwing="e")
	public void noticeException(Exception e) {
		System.out.println(e.getMessage());
	}
	@AfterReturning(pointcut=("execution(* step03.ano.biz.aop.Car.sale*(..))"), returning="v")
	public void noticeReturn(Object v) {
		System.out.println("--"+v+"--");
	}
}
