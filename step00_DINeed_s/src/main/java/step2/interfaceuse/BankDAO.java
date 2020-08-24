package step2.interfaceuse;

//미완성 메소드와 static final 상수로 구성
//용도 : 스펙으로 사용
//하위 클래스들이 메소드 재정의 필수
//문법 : 상속과 다형성
public interface BankDAO {
	public void getConnection();//DB접속용 메소드로 구현
	public void select();//select sql문장 실행 메소드로 구현
	public void insert();//insert sql문장 실행 메소드로 구현
	public void update();//update sql문장 실행 메소드로 구현
	public void delete();//delete sql문장 실행 메소드로 구현
	//.....
}
