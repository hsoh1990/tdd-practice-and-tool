import static org.junit.Assert.*;

public class AccountTest {
    public void testAccount() throws Exception {
        Account account =  new Account();
        if (account == null) {
            throw new Exception("계좌 생성 실패");
        }
    }

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        try {
            accountTest.testAccount();
        } catch (Exception e) {
            System.out.printf("실패");
            e.printStackTrace();
        }
        System.out.printf("성공");
    }


}