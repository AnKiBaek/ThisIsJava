package practice6_07.sec08.exam03;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone = new Phone();
		
		phone.setBattery(100);
		
		if(phone.isLeftBattery()) {
			System.out.println("휴대폰을 사용합니다.");
			phone.run();
		}
		System.out.println("배터리를 충전하세요");

	}

}
