package step2.interfaceuse;

public class BankTest {

	public static void main(String[] args) {
		BankService service = new BankService();
		
		//객체 생성 코드
		BankDAO dao = service.getDB("oracle");
		
		//표준화된 메소드 호출
		dao.getConnection();
		dao.select();
		dao.update();
		dao.delete();
	}
}
