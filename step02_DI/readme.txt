�н� ����

1. step01
	- ���� �н�


2. step02
	- ������̼��� �̿��� DI ����
	- XML ���ο� ������̼��� �ڹ� �ҽ����� ����ϰڴٰ� �����ؾ��Ѵ�
	- ���� ����
		xml - java source�� ������̼��� ����ϰڴٴ� ���� �ʼ�
			- spring-context.jar ���� �ʼ�
			- <context:annotation-config />
	- java source
		- @Autowired : Ÿ���� �������� ���� ��ü ���Կ� ����
					   ��ġ - member ���� ���� or setter ����
					  
3. step03
	- xml�� <bean> tag ���� ���� �ڹ� �ҽ����� bean���� ����ϴ� ����
	- xml ����
		<context:annotation-config/>
		<context:component-scan base-package="package name"/>
		
	- Spring bean���� ����� Ŭ���� ����
		@Component
		@Scope("prototype") 
	