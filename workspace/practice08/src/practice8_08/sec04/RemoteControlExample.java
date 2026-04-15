package practice8_08.sec04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolume(-10);
		audio.turnOff();
	}

}
