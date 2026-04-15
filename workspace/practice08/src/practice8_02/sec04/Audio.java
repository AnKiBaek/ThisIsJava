package practice8_02.sec04;

public class Audio implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("Audio를 켭니다.");	
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.volume = MIN_VOLUME;
			System.out.println("Audio를 음소거 합니다.");
		}
		
	}
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Audio 볼륨: " + this.volume);
	}
}
