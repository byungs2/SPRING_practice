package step3.spring;

public interface BankDAO {
	public void getConnection();//DB접속용 메소드로 구현
	public void select();//select sql문장 실행 메소드로 구현
	public void insert();//insert sql문장 실행 메소드로 구현
	public void update();//update sql문장 실행 메소드로 구현
	public void delete();//delete sql문장 실행 메소드로 구현
	//.....
}
 