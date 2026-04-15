package ch11.sec101;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.Up(2000);
		account.Up(10);
		
		try {
			account.Down(20000);
		} catch (InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
