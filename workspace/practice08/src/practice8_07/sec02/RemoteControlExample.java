package practice8_07.sec02;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl rc =new Audio();
		rc.turnOn();
		
		rc = new Television();
		rc.turnOn();
	}

}
