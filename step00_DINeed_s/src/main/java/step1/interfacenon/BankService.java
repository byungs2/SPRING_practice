package step1.interfacenon;

public class BankService {
	BankOracleDAO oracleDAO = new BankOracleDAO();
	BankDB2DAO db2DAO = new BankDB2DAO();

	public void getOracleConnection(){		
		System.out.println(oracleDAO.getConnection());
	}
	public void getDB2Connection(){	
		System.out.println(db2DAO.getDB2Connection());
	}
	public void oracleSelect(){		
		oracleDAO.getOracleSelect();
	}
	public void db2Select(){		
		db2DAO.getDB2Select();
	}
	//...
}
