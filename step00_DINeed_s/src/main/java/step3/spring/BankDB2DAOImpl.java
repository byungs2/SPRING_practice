package step3.spring;

public class BankDB2DAOImpl implements BankDAO{
	public BankDB2DAOImpl(){
		System.out.println("BankDB2DAOImpl 생성자");
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
		return "DB2 객체";
	}
}