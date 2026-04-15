package practice8_05.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		tv.setVolume(12);
		tv.turnOff(); 
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolume(-10);
		audio.turnOff();
	}
}
