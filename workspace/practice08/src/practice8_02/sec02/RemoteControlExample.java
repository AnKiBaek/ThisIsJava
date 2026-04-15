package practice8_02.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		
		rc.turnOn();
		
		rc = new Audio();
		
		rc.turnOn();

	}

}
