package practice8_03.sec04;

public class Television implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	System.out.println("Tv를 켭니다.");	
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	System.out.println("Tv를 끕니다.");	
	}
	
	@Override
	public void setVolume(int volume) {
	
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("Tv볼륨: " + this.volume);
		
	}
}
