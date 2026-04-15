package practice8_06.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		
		if(rc instanceof Audio audio) {
			audio.turnOn();
			audio.setVol(12);
			audio.setMute(true);
			audio.turnOff();
		}
	}
}
