package step2.interfaceuse;

public class BankOracleDAOImpl implements BankDAO{
	public BankOracleDAOImpl(){
		System.out.println("BankOracleDAO 생성자");
	}
	@Override
	public void getConnection() {
		System.out.println("oracle db 접속");
	}

	@Override
	public void select() {}

	@Override
	public void insert() {}

	@Override
	public void update() {}

	@Override
	public void delete() {}
}
