package practice5_6.sec05;

public class ReturnExample {
	
	private void sound() {
		System.out.println("Teleleleleleleee..");
	}

	public static void main(String[] args) {
	
		ReturnExample  ex = new ReturnExample();
		
		String phone = "전화기: ";
		
		System.out.printf(phone);
		ex.sound();

	}

}
