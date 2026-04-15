package ch11.sec06;

public class Account {
	
	private long balance;
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public long plusMoney(long money) {
		balance += money;
		System.out.println(money+"원추가: "+balance);
		return balance;
	}
	
	public long minusMoney(long money) throws InsufficientException {
		
		if(balance < money) {
			throw  new InsufficientException("잔액이" + (money-balance) +"부족합니다");
		}
		System.out.println(money+"원출금: "+balance);
		balance -= money;
		
		return money;	
	}
}
