package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.plusMoney(10000);

		try {
			account.minusMoney(20000);
			
		} catch (InsufficientException e) {
			e.printStackTrace();
			System.out.println("잔액: "+ account.getBalance());
		}
	}

}
