package step1.interfacenon;

public class OracleDBUseTest {

	public static void main(String[] args) {
		BankService service = new BankService();
		service.getOracleConnection();
	}

}
