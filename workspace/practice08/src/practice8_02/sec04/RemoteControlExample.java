package practice8_02.sec04;

public class RemoteControlExample {
	
	public static void main(String[] args) {
	
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		audio.turnOn();
		audio.setVolume(20);
		audio.setVolume(-20);
		audio.setMute(true);
		
		System.out.println();
		
		tv.turnOn();
		tv.setVolume(20);
		tv.setVolume(-20);
		tv.setMute(true);
	}

}
