package step1.interfacenon;

public class BankOracleDAO {
	public BankOracleDAO(){
		System.out.println("BankOracleDAO 생성자");
	}
	public String getConnection(){
		return "oracle DB 접속";
	}
	//검색
	public String getOracleSelect(){
		return null;
	}

}
