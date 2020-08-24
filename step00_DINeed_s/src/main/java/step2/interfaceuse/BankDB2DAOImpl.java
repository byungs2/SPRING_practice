package step2.interfaceuse;

public class BankDB2DAOImpl implements BankDAO{
	public BankDB2DAOImpl(){
		System.out.println("BankDB2DAO 생성자");
	}
	@Override
	public void getConnection() {
		System.out.println("DB2 db 접속");
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