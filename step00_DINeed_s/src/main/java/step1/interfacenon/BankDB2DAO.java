package step1.interfacenon;

public class BankDB2DAO {
	public BankDB2DAO(){
		System.out.println("BankDB2DAO 생성자");
	}
	public String getDB2Connection(){
		return "DB2 DB 접속";
	}
	//검색
	public String getDB2Select(){
		return null;
	}

}