package step2.interfaceuse;

public class BankService {
	//interface 타입/하위 자식은 BankOracleDAOImpl과 BankDB2DAOImpl 
	//상위타입 변수 = new 자식객체생성()
	BankDAO dao; 
	
	public BankDAO getDB(String dbName){
		if(dbName.equals("oracle")){
			return new BankOracleDAOImpl();
		}else if(dbName.equals("db2")){
			return new BankDB2DAOImpl();
		}else{
			return null;
		}
	}
	public void getConnection(){		
		dao.getConnection();
	}
	//...
}
