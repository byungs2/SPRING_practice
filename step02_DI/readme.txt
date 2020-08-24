학습 내용

1. step01
	- 기초 학습


2. step02
	- 어노테이션을 이용한 DI 설정
	- XML 내부에 어노테이션을 자바 소스에서 사용하겠다고 선언해야한다
	- 적용 문법
		xml - java source에 어노테이션을 사용하겠다는 선언 필수
			- spring-context.jar 세팅 필수
			- <context:annotation-config />
	- java source
		- @Autowired : 타입을 기준으로 의존 객체 주입에 적용
					   위치 - member 변수 선언구 or setter 선언구
					  
3. step03
	- xml에 <bean> tag 설정 없이 자바 소스에서 bean으로 등록하는 설정
	- xml 문서
		<context:annotation-config/>
		<context:component-scan base-package="package name"/>
		
	- Spring bean으로 등록할 클래스 선언구
		@Component
		@Scope("prototype") 
	