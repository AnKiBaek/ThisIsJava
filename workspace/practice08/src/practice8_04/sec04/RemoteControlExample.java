package practice8_04.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		
		tv.turnOn();
		tv.setVolume(12);
		tv.setVolume(-102);
		tv.turnOff();
	}
}
