package ch08.sec02;

public class RemoteContrlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스 변수 rc Television으로 객체화
		RemoteControl rc = new Television();
		
		// 구현된 turnOn() 호출
		rc.turnOn();
		
		rc = new Audio();
		
		rc.turnOn();
		
	}

}
