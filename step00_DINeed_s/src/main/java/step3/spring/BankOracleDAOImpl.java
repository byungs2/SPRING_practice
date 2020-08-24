package step3.spring;

public class BankOracleDAOImpl implements BankDAO{
	public BankOracleDAOImpl(){
		System.out.println("BankOracleDAO 생성자");
	}
	@Override
	public void getConnection() {}

	@Override
	public void select() {}

	@Override
	public void insert() {}

	@Override 
	public void update() {}

	@Override
	public void delete() {}
	@Override
	public String toString() {
		return "Oracle 객체";
	}
}
