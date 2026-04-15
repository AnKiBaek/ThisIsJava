package ch11.sec101;

public class Account {

	private long balance;
	
	public Account() {
	// TODO Auto-generated constructor stub
	}
	
	public long Up(long product) {
		System.out.println("재고 추가 기존수량 :"+balance);
		System.out.println("재고 추가수량 :"+product);
		balance +=product;
		System.out.println("재고 추가 합계수량 :"+balance);
		return balance;
	}
	
	public long Down(long product) throws InsufficientException {
		System.out.println("출고시도: "+product+"개");
		
		if(balance<product) {
			throw new InsufficientException("수량부족  미달수량: "+(product - balance));
		}
		balance -= product;
		
		System.out.println("출고완료 남은재고 : "+balance);
		
		return balance;
	}


}
